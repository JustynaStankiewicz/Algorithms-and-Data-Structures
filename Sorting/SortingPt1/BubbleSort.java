package Task;

public class BubbleSort<T> {
    //metoda sort i w niej tablica
    public void sortInt(int[] tablica) {
        int i;//te juz posortowane
        int j;//te jeszcze nieposortowane
        int temp;
        for (i = 0; i < tablica.length - 1; i++) {
            for (j = 0; j < tablica.length - 1 - i; j++) {
                //porownanie i zamiana miejsc
                if (tablica[j] > tablica[j + 1]) {
                    temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
    }

    public void sort(Comparable tablica[]) {
        int i;//te juz posortowane
        int j;//te jeszcze nieposortowane
        Comparable temp;
        for (i = 0; i < tablica.length - 1; i++) {
            for (j = 0; j < tablica.length - 1 - i; j++) {
                //porownanie i zamiana miejsc
                if (tablica[j].compareTo(tablica[j + 1]) > 0) {
                    temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
    }

    //testy
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int tablica[] = {5, 8, 1, 6, 9, 2};
        bubbleSort.sortInt(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");
        }
        System.out.println("\n");
        Integer tablicaLiczb[] = {5, 8, 1, 6, 9, 2};
        bubbleSort.sort(tablicaLiczb);
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println(tablicaLiczb[i] + " ");
        }
        System.out.println("\n");
        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        bubbleSort.sort(tablicaLiter);
        for (int i = 0; i < tablicaLiter.length; i++) {
            System.out.println(tablicaLiter[i] + " ");
        }
    }
}

