package Task2;

import java.util.Iterator;

public interface ListIterator<E> extends Iterator<E> {
    void add(E e);// dodanie e w bieżącej pozycji, za kursor

    boolean hasNext();

    boolean hasPrevious();// jak hasNext, ale w przeciwnym kierunku

    E next();//zwraca nastepny element i przesuwa kursor

    int nextIndex();// indeks elementu, który byłby zwrócony przez next()

    E previous();//jak next(),ale w przeciwnym kierunku i przesuwa kursor

    int previousIndex();//jak nextIndex(),ale w przeciwnym kierunku

    void remove(); // usuwa ostatnio zwrócony element przez next() lub previous()

    void set(E e);//wstawia wartość e do kolekcji pod ostatnio zwrócony element
}
