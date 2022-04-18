package Task1;

public class InsertSort implements Algorytm {
    @Override
    public Returned sort(Comparable tablica[]) {
        long czasStart = System.currentTimeMillis();
        int liczbaPrzesuniec = 0;
        int liczbaPorownan = 0;
        for (int i = 1; i < tablica.length; ++i) {
            Comparable klucz = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j].compareTo(klucz) > 0) {
                liczbaPrzesuniec++;
                Comparable temp = tablica[j];
                tablica[j] = tablica[j + 1];
                tablica[j + 1] = temp;
                j--;
            }
            liczbaPorownan++;
        }
        long czasKoniec = System.currentTimeMillis();
        long czasDzialania = czasKoniec - czasStart;
        return new Returned(liczbaPorownan, liczbaPrzesuniec, czasDzialania);
    }

    @Override
    public String toString() {
        return "InsertSort";
    }

    public static void main(String args[]) {

        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        String string[] = {"a", "z", "q", "p"};

        InsertSort algorytm = new InsertSort();
        Returned returned = algorytm.sort(tablica);
        System.out.println("Zad1.InsertSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }

        algorytm.sort(string);
        System.out.println("\nTask1.InsertSort");
        for (int i = 0; i < string.length; ++i) {
            System.out.print(string[i] + " ");
        }

        System.out.println("Liczba porownan i przesuniec");
        System.out.println(returned.toString());
    }
}
