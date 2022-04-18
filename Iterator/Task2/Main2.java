package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Student2[] studenci2 = new Student2[5];
        ArrayList oceny1 = new ArrayList(Arrays.asList(4.0, 5.5, 4.5));
        ArrayList oceny2 = new ArrayList(Arrays.asList(3.0, 3.5, 3.5));
        ArrayList oceny3 = new ArrayList(Arrays.asList(4.0, 4.0, 4.5));
        ArrayList oceny4 = new ArrayList(Arrays.asList(5.5, 5.5, 2.5));
        ArrayList oceny5 = new ArrayList(Arrays.asList(2.0, 2.5, 2.0));

        studenci2[0] = new Student2(1, "Nowak", "Arek", oceny1);
        studenci2[1] = new Student2(2, "Kowalski", "Michał", oceny2);
        studenci2[2] = new Student2(3, "Pawłowski", "Patryk", oceny3);
        studenci2[3] = new Student2(4, "Kuźniak", "Alicja", oceny4);
        studenci2[4] = new Student2(5, "Fog", "Marta", oceny5);

        System.out.println("Studenci:");
        wyswietl(new ArrayIterator(studenci2));
        System.out.println("\nPo dopisaniu:");
        dopisz(new ArrayIterator(studenci2), 2, 4.5);
        wyswietl(new ArrayIterator(studenci2));
        System.out.println("\nSrednia:");
        wyliczSrednia(new FilterIterator(new ArrayIterator(studenci2), new PredykatOcenaPozytywna()));
        System.out.println("\nNiezaliczył/a:");
        ktoNiezaliczyl(new FilterIterator(new ArrayIterator(studenci2), new PredykatNiezaliczyl()));
    }

    public static void wyswietl(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }

    public static void dopisz(Iterator iterator, long numer, double ocena) {
        while (iterator.hasNext()) {
            Student2 pomoc = (Student2) iterator.next();
            if (pomoc.getNumerIndeksu() == numer) {
                pomoc.getOceny().add(ocena);
            }
        }
    }

    public static void wyliczSrednia(Iterator iterator) {
        //Zad1.Iterator<Student2> iterStud = new Zad1.ArrayIterator<Student2>(tablica);
        //Zad1.Predicate predicate = new Zad1.PredykatOcenaPozytywna();
        //Zad1.Iterator<Student2> filterIter = new Zad1.FilterIterator<>(iterStud, predicate);
        double suma = 0;
        int ilosc = 0;
        while (iterator.hasNext()) {
            suma += ((Student2) iterator.next()).obliczSrednia();
            ilosc++;
        }
        System.out.println(suma / ilosc);
    }

    public static void ktoNiezaliczyl(Iterator iterator) {
        //Zad1.Iterator<Student2> iterStud = new Zad1.ArrayIterator<Student2>(tablica);
        //Zad1.Predicate predicate2 = new Zad1.PredykatNiezaliczyl();
        //Zad1.Iterator<Student2> filterIter2 = new Zad1.FilterIterator<>(iterStud, predicate2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
