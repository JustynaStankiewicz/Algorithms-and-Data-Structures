package Task2;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    int pozycja = 0;
    T[] tablica;

    public ArrayIterator(T[] taTablica) {
        tablica = taTablica;
    }

    @Override
    public boolean hasNext() {
        return pozycja < tablica.length;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (hasNext()) {
            return tablica[pozycja++];
        } else throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
