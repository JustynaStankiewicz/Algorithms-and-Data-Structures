package Task;

public class InsertSort<T> {
    public void sortInt(int tablica[]) {
        int i;
        int j;
        int key;
        int temp;
        for (i = 1; i < tablica.length; i++) {
            key = tablica[i];
            j = i - 1;
            while (j >= 0 && key < tablica[j]) {
                temp = tablica[j];
                tablica[j] = tablica[j + 1];
                tablica[j + 1] = temp;
                j--;
            }
        }
    }

    public void sort(Comparable tablica[]) {
        int i;
        int j;
        Comparable key;
        Comparable temp;
        for (i = 1; i < tablica.length; i++) {
            key = tablica[i];
            j = i - 1;
            while (j >= 0 && tablica[j].compareTo(key) > 0) {
                temp = tablica[j];
                tablica[j] = tablica[j + 1];
                tablica[j + 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int tablica[] = {5, 8, 1, 6, 9, 2};
        insertSort.sortInt(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");
        }
        System.out.println("\n");
        Integer tablicaLiczb[] = {5, 8, 1, 6, 9, 2};
        insertSort.sort(tablicaLiczb);
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println(tablicaLiczb[i] + " ");
        }
        System.out.println("\n");
        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        insertSort.sort(tablicaLiter);
        for (int i = 0; i < tablicaLiter.length; i++) {
            System.out.println(tablicaLiter[i] + " ");
        }
    }
}


