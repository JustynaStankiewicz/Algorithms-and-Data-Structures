package Task2;

//import Zad1.OneWayLinkedListWithHead;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneWayLinkedListIterator<E> implements Iterator<E> {
    int cursor_position = 0;
    boolean canBeRemovedOrSet;
    OneWayLinkedListWithHead<E> list;

    public OneWayLinkedListIterator(OneWayLinkedListWithHead<E> list) {
        this.list = list;
    }

    void add(E e) // dodanie e w bieżącej pozycji, za kursor
    {
        if (list.get(cursor_position + 1) != null) {
            list.set(cursor_position + 1, e);
        } else canBeRemovedOrSet = false;
    }

    public boolean hasNext() {
        if (list.get(cursor_position) != null) {
            return true;
        } else return false;
    }

    boolean hasPrevious()// jak hasNext, ale w przeciwnym kierunku
    {
        if (list.get(cursor_position - 1) != null) {
            return true;
        } else return false;
    }

    public E next() throws NoSuchElementException {
        if (hasNext()) {
            canBeRemovedOrSet = true;
            return list.get(cursor_position++);
        } else throw new NoSuchElementException();
    }

    int nextIndex() // indeks elementu, który byłby zwrócony przez next()
    {
        if (!hasNext()) {
            return list.size();
        }
        int tempCursor = cursor_position + 1;
        return tempCursor;
    }

    E previous() throws NoSuchElementException {
        if (hasNext()) {
            canBeRemovedOrSet = true;
            return list.get(--cursor_position);
        } else throw new NoSuchElementException();
    }

    int previousIndex() //jak nextIndex(),ale w przeciwnym kierunku
    {
        {
            if (cursor_position == 0) {
                return -1;
            }
            int tempCursor = cursor_position - 1;
            return tempCursor;
        }
    }

    public void remove() throws IllegalStateException // usuwa ostatnio zwrócony element przez next() lub previous()
    {
        if (canBeRemovedOrSet) {
            list.remove(cursor_position - 1);
            canBeRemovedOrSet = false;
        } else throw new IllegalStateException();

    }

    void set(E e) throws IllegalStateException //wstawia wartość e do kolekcji pod ostatnio zwrócony element
    {
        if (canBeRemovedOrSet) {
            list.set(cursor_position, e);
            canBeRemovedOrSet = false;
        } else throw new IllegalStateException();

    }
}
