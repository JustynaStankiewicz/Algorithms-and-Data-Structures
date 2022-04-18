package Task1;

import java.io.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        OneWayLinkedListWithHead studenci1 = new OneWayLinkedListWithHead();
        Student pierwszy = new Student(1, "Nowak", "Arek", 5);
        Student drugi = new Student(2, "Kowalski", "Michał", 3.5);
        Student trzeci = new Student(3, "Pawłowski", "Patryk", 2.5);
        Student czwarty = new Student(4, "Kuźniak", "Alicja", 4.5);
        Student piaty = new Student(5, "Fog", "Marta", 5);
        studenci1.add(pierwszy);
        studenci1.add(drugi);
        studenci1.add(trzeci);
        studenci1.add(czwarty);
        studenci1.add(piaty);

        System.out.println("Studenci:");
        wyswietl(new OneWayLinkedListIterator(studenci1));
        usun(new OneWayLinkedListIterator(studenci1), 3);
        System.out.println("Po usunieciu:");
        wyswietl(new OneWayLinkedListIterator(studenci1));
        zapis(studenci1);
        System.out.println("\n");
        odczyt();

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
}
