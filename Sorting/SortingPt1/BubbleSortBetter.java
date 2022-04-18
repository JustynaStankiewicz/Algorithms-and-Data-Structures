package Task;

import java.util.Comparator;

public class BubbleSortBetter<T> implements ListSorter<T> {
    private final Comparator<T> _comparator;

    public BubbleSortBetter(Comparator<T> comparator) {
        _comparator = comparator;
    }

    // wynikiem jest posortowana lista pierwotna
// wersja ulepszona wykrywająca wcześniejsze uporządkowanie
    public IList<T> sort(IList<T> list) {
        int lastSwap = list.size() - 1; //pozycja ostatniej zamiany
        while (lastSwap > 0) {
            int end = lastSwap;
            lastSwap = 0;
            for (int left = 0; left < end; ++left) {
                if (_comparator.compare(list.get(left), list.get(left + 1)) > 0) { //ciąg zamian jest zastąpiony ciągiem przepisań
                    T temp = list.get(left);
                    while (left < end && _comparator.compare(temp, list.get(left + 1)) > 0) {
                        list.set(left, list.get(left + 1));
                        left++;
                    }
                    lastSwap = left;
                    list.set(left, temp);
                }
            }
        }
        return list;
    }
}
