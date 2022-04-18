package Task1;

public class Main {
    public static void main(String[] args) {
        Student[] studenci = new Student[5];
        Student pierwszy = new Student(1, "Nowak", "Arek", 5);
        Student drugi = new Student(2, "Kowalski", "Michał", 3.5);
        Student trzeci = new Student(3, "Pawłowski", "Patryk", 2.5);
        Student czwarty = new Student(4, "Kuźniak", "Alicja", 4.5);
        Student piaty = new Student(5, "Fog", "Marta", 5);
        studenci[0] = pierwszy;
        studenci[1] = drugi;
        studenci[2] = trzeci;
        studenci[3] = czwarty;
        studenci[4] = piaty;

        System.out.println("Studenci:");
        wyswietl(new ArrayIterator(studenci));
        wpisz(new ArrayIterator(studenci), 4, 5);
        System.out.println("\nPo dopisaniu:");
        wyswietl(new ArrayIterator(studenci));
        System.out.println("\nSrednia");
        srednia(new FilterIterator(new ArrayIterator(studenci), new PredykatOcenaPozytywna()));
        System.out.println("\nNiezaliczył/a:");
        ktoNieZdal(new FilterIterator(new ArrayIterator(studenci), new PredykatNiezaliczyl()));


    }

    public static void wyswietl(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }

    public static void wpisz(Iterator iterator, int numer, double ocena) {
        while (iterator.hasNext()) {
            Student pomoc = (Student) iterator.next();
            if (pomoc.getNumerIndeksu() == numer) {
                pomoc.setOcena(ocena);
            }
        }
    }

    public static void srednia(Iterator iterator) {
        double suma = 0;
        int iloscPozytywnych = 0;
        while (iterator.hasNext()) {
            suma += ((Student) iterator.next()).getOcena();
            iloscPozytywnych++;
        }
        System.out.println(suma / iloscPozytywnych);
    }

    public static void ktoNieZdal(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
