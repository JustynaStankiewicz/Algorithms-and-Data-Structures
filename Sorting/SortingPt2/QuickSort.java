package Task1;

import java.util.Random;

public class QuickSort implements Algorytm {

    private Returned returned = new Returned(0, 0, 0);

    public Returned sort(Comparable[] tablica) {
        long czasStart = System.currentTimeMillis();
        quickSort(tablica);
        long czasDzialania = System.currentTimeMillis() - czasStart;
        returned.czas = czasDzialania;
        return returned;
    }

    public void quickSort(Comparable[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(Comparable[] A, int low, int high) {
        if (low < high + 1) {
            int p = partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
    }

    private void swap(Comparable[] A, int index1, int index2) {
        Comparable temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
        returned.liczbaPrzesuniec++;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(Comparable[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[low].compareTo(A[i]) > 0) {
                swap(A, i, border++);
            }
            returned.liczbaPorownan++;
        }
        swap(A, low, border - 1);
        return border - 1;
    }

    private static void print(Comparable[] array) {
        for (Comparable i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "QuickSort";
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Integer[] array = {5, 4, 3, 2, 1};
        System.out.println("Array: ");
        print(array);


        quickSort.quickSort(array);
        System.out.println("Sorted: ");
        print(array);

        quickSort = new QuickSort();
        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        System.out.println("Array: ");
        print(tablicaLiter);

        quickSort.quickSort(tablicaLiter);
        System.out.println("Sorted: ");
        print(tablicaLiter);

        quickSort.sort(array);
        System.out.println(quickSort.returned.toString());

        quickSort.sort(tablicaLiter);
        System.out.println(quickSort.returned.toString());

        quickSort = new QuickSort();
        Integer[] tablica = new Integer[10000];
        Random generator = new Random();
        for (int i = 0; i < 10000; i++) {
            tablica[i] = generator.nextInt(50);
        }
        quickSort.quickSort(tablica);
        System.out.println("Sorted: ");
        print(tablica);

        quickSort.sort(tablica);
        System.out.println(quickSort.returned.toString());


    }


}
