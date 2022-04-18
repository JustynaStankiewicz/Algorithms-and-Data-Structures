package Task1;

public class SelectSort1 implements Algorytm {
    @Override
    public Returned sort(Comparable tablica[]) {
        long czasStart = System.currentTimeMillis();
        int liczbaPrzesuniec = 0;
        int liczbaPorownan = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            int elementMinimalny = i;
            for (int j = i + 1; j < tablica.length; j++) {
                liczbaPorownan++;
                if (tablica[j].compareTo(tablica[elementMinimalny]) < 0)
                    elementMinimalny = j;
            }

            Comparable wartoscPomocnicza = tablica[elementMinimalny];
            tablica[elementMinimalny] = tablica[i];
            tablica[i] = wartoscPomocnicza;
            liczbaPrzesuniec++;
        }
        long czasDzialania = System.currentTimeMillis() - czasStart;
        return new Returned(liczbaPorownan, liczbaPrzesuniec, czasDzialania);
    }

    @Override
    public String toString() {
        return "SelectSort";
    }

    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        String string[] = {"a", "z", "q", "p"};

        SelectSort1 algorytm = new SelectSort1();
        Returned returned = algorytm.sort(tablica);
        System.out.println("Zad1.SelectSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }

        algorytm.sort(string);
        System.out.println("\nZad1.SelectSort");
        for (int i = 0; i < string.length; ++i) {
            System.out.print(string[i] + " ");
        }

        System.out.println("Liczba porownan i przesuniec");
        System.out.println(returned.toString());

    }
}
