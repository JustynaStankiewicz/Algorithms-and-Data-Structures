package Task1;

import java.util.Random;

public class MergeSort implements Algorytm {

    private Returned returned = new Returned(0, 0, 0);

    @Override
    public Returned sort(Comparable[] tablica) {
        long czasStart = System.currentTimeMillis();
        mergeSort(tablica);
        long czasDzialania = System.currentTimeMillis() - czasStart;
        returned.czas = czasDzialania;
        return returned;
    }

    private Comparable[] mergeSort(Comparable[] array) {

        if (array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;

        Comparable[] left = new Comparable[midpoint];
        Comparable[] right = new Comparable[array.length - midpoint];

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }
        Comparable[] result = new Comparable[array.length];

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);
        return result;
    }

    private Comparable[] merge(Comparable[] left, Comparable[] right) {

        Comparable[] result = new Comparable[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (right[rightPointer].compareTo(left[leftPointer]) > 0) {
                    result[resultPointer++] = left[leftPointer++];
                    returned.liczbaPrzesuniec++;
                } else {
                    result[resultPointer++] = right[rightPointer++];
                    returned.liczbaPrzesuniec++;
                }

            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
                returned.liczbaPrzesuniec++;
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
                returned.liczbaPrzesuniec++;
            }
            returned.liczbaPorownan++;
        }

        return result;
    }

    private static void print(Comparable[] array) {
        for (Comparable i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "MergeSort";
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        Integer[] array = {5, 4, 3, 2, 1};
        System.out.println("Array: ");
        print(array);

        Comparable[] array1;
        array1 = mergeSort.mergeSort(array);
        System.out.println("Sorted: ");
        print(array1);

        mergeSort = new MergeSort();

        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        System.out.println("Array: ");
        print(tablicaLiter);

        Comparable[] array2;
        array2 = mergeSort.mergeSort(tablicaLiter);
        System.out.println("Sorted: ");
        print(array2);

        mergeSort.sort(array);
        System.out.println(mergeSort.returned.toString());

        mergeSort.sort(tablicaLiter);
        System.out.println(mergeSort.returned.toString());

        mergeSort = new MergeSort();

        Integer[] tablica = new Integer[10000];
        Random generator = new Random();
        for (int i = 0; i < 10000; i++) {
            tablica[i] = generator.nextInt(50);
        }
        Comparable[] array3;
        array3 = mergeSort.mergeSort(tablica);
        System.out.println("Sorted: ");
        print(array3);

        mergeSort.sort(tablica);
        System.out.println(mergeSort.returned.toString());


    }


}
