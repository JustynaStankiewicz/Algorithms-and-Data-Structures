package Task;

public class SelectSort<T> {
    public void sortInt(int tablica[]) {
        int i;//od 0 do wielkosc tablicy, posortowane najmniejsze
        int j;//od i do wielkosc tablicy
        int temp;
        int minIndex;
        for (i = 0; i < tablica.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < tablica.length; j++) {
                if (tablica[j] < tablica[minIndex]) {
                    //znajdujemy najmniejszy element
                    minIndex = j;
                }
            }
            //gdy znajdziemy najmniejszy to zamieniamy miejscami
            temp = tablica[minIndex];
            tablica[minIndex] = tablica[i];
            tablica[i] = temp;


        }

    }

    public void sort(Comparable tablica[]) {
        int i;//od 0 do wielkosc tablicy, posortowane najmniejsze
        int j;//od i do wielkosc tablicy
        Comparable temp;
        int minIndex;
        for (i = 0; i < tablica.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < tablica.length; j++) {
                if (tablica[j].compareTo(tablica[minIndex]) < 0) {
                    //znajdujemy najmniejszy element
                    minIndex = j;
                }
            }
            //gdy nie ma nic mniejszego to zamieniamy miejscami
            temp = tablica[minIndex];
            tablica[minIndex] = tablica[i];
            tablica[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int tablica[] = {5, 8, 1, 6, 9, 2};
        selectSort.sortInt(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");
        }
        System.out.println("\n");
        Integer tablicaLiczb[] = {5, 8, 1, 6, 9, 2};
        selectSort.sort(tablicaLiczb);
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println(tablicaLiczb[i] + " ");
        }
        System.out.println("\n");
        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        selectSort.sort(tablicaLiter);
        for (int i = 0; i < tablicaLiter.length; i++) {
            System.out.println(tablicaLiter[i] + " ");
        }
    }
}

