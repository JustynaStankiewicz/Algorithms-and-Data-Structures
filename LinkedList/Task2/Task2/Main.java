package Task2;

//import Zad1.OneWayLinkedListIterator;
//import Zad1.OneWayLinkedListWithHead;
//import Zad1.Student;

import java.io.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        OneWayLinkedListWithHead studenci1 = new OneWayLinkedListWithHead();
        Student student1 = new Student(1, "Nowak", "Arek", 5);
        Student student2 = new Student(2, "Kowalski", "Michał", 3.5);
        Student student3 = new Student(4, "Pawłowski", "Patryk", 2.5);
        Student student4 = new Student(6, "Kuźniak", "Alicja", 4.5);
        Student student5 = new Student(9, "Fog", "Marta", 5);
        studenci1.add(student1);
        studenci1.add(student2);
        studenci1.add(student3);
        studenci1.add(student4);
        studenci1.add(student5);

        OneWayLinkedListWithHead studenci2 = new OneWayLinkedListWithHead();
        Student student6 = new Student(3, "Sowa", "Weronika", 6);
        Student student7 = new Student(5, "Wiśniewski", "Karol", 4.5);
        Student student8 = new Student(7, "Patecki", "Jakub", 2);
        Student student9 = new Student(11, "Mini", "Majk", 2.5);
        studenci2.add(student6);
        studenci2.add(student7);
        studenci2.add(student8);
        studenci2.add(student9);


        System.out.println("Studenci:");
        wyswietl(new OneWayLinkedListIterator(studenci1));
        usun(new OneWayLinkedListIterator(studenci1), 3);
        System.out.println("Po usunieciu:");
        wyswietl(new OneWayLinkedListIterator(studenci1));
        zapis(studenci1);
        System.out.println("\n");
        odczyt();
        System.out.println("\n");
        System.out.println(unit(studenci1, studenci2));
    }

    public static void wyswietl(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void usun(Iterator iterator, int numerIndeks) {
        while (iterator.hasNext()) {
            Student temp = (Student) iterator.next();
            if (temp.getNumerIndeksu() == numerIndeks) {
                iterator.remove();
            }
        }
    }

    public static void zapis(OneWayLinkedListWithHead list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("odczyt")))) {
            oos.writeObject(list);

        } catch (Exception a) {
            a.getMessage();
        }
    }

    public static void odczyt() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream((new File("odczyt"))))) {
            while (true) {
                wyswietl(new OneWayLinkedListIterator<Student>((OneWayLinkedListWithHead<Student>) ois.readObject()));
            }

        } catch (Exception a) {
            a.getStackTrace();
        }
    }

    public static OneWayLinkedListWithHead<Student> unit(OneWayLinkedListWithHead<Student> list1, OneWayLinkedListWithHead<Student> list2) {
        for (Student s1 : list1) {
            for (Student s2 : list2) {
                if (s2.getNumerIndeksu() < s1.getNumerIndeksu()) {
                    list1.add(list1.indexOf(s1), list2.remove(list2.indexOf(s2)));
                }
            }
        }
        list1.addAll(list2);
        return list1;
    }
}
