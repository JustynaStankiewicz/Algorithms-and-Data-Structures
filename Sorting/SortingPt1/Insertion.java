package Task;

import static Task.Example.exch;
import static Task.Example.less;

public class Insertion {
    public static void sort(Comparable[] a) { // Sortowanie a[] w porządku rosnącym,
        int N = a.length;
        for (int i = 1; i < N; i++) { // Wstawianie a[i] między a [ i- 1] , a[i-2], a [ i-3] itd.
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
