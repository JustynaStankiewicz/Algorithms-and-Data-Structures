package Task1;

public class BubbleSort1 implements Algorytm {
    @Override
    public Returned sort(Comparable tablica[]) {
        long czasStart = System.currentTimeMillis();
        int liczbaPrzesuniec = 0;
        int liczbaPorownan = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            for (int j = 0; j < tablica.length - i - 1; j++) {
                if (tablica[j].compareTo(tablica[j + 1]) > 0) {
                    liczbaPrzesuniec++;
                    Comparable wartoscPomocnicza = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = wartoscPomocnicza;
                }
                liczbaPorownan++;
            }
        }
        long czasDzialania = System.currentTimeMillis() - czasStart;
        return new Returned(liczbaPorownan, liczbaPrzesuniec, czasDzialania);
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }

    // Driver method to test above
    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        String string[] = {"a", "z", "q", "p"};

        BubbleSort1 algorytm = new BubbleSort1();
        Returned returned = algorytm.sort(tablica);
        System.out.println("Zad1.BubbleSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }

        algorytm.sort(string);
        System.out.println("\nZad1.BubbleSort");
        for (int i = 0; i < string.length; ++i) {
            System.out.print(string[i] + " ");
        }

        System.out.println("Liczba porownan i przesuniec");
        System.out.println(returned.toString());
    }
}
