package Task;

import static Task.Example.exch;
import static Task.Example.less;

public class Selection {

    public static void sort(Comparable[] a) { // Sortowanie a [] w porządku rosnącym,
        int N = a.length; // Długość tab licy ,
        for (int i = 0; i < N; i++) { // Przestawianie a [i ] z najmniejszym elementem z a [i+ l...N ).
            int min = i; // Indeks minimalnego elementu,
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }

}

