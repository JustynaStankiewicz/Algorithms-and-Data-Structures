import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ExtendedOneWayLinkedListWithHead<E> extends AbstractList<E> implements Iterable<E> {
    private OneWayLinkedListWithHead<E> innerList = new OneWayLinkedListWithHead<>();

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {
            int cursor = 0;
            boolean canBeRemovedOrSet;

            @Override
            public boolean hasNext() {
                if (innerList.get(cursor + 1) != null) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                cursor++;
                canBeRemovedOrSet = true;
                return innerList.get(cursor);
            }

            @Override
            public boolean hasPrevious() {
                if (innerList.get(cursor - 1) != null) {
                    return true;
                }
                return false;
            }

            @Override
            public E previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                cursor--;
                canBeRemovedOrSet = true;
                return innerList.get(cursor);
            }

            @Override
            public int nextIndex() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                cursor++;
                return cursor;
            }

            @Override
            public int previousIndex() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                cursor--;
                return cursor;
            }

            @Override
            public void remove() {
                if (canBeRemovedOrSet == true) {
                    innerList.remove(cursor);
                    canBeRemovedOrSet = false;
                } else {
                    throw new IllegalStateException();
                }
            }

            @Override
            public void set(E e) {
                if (canBeRemovedOrSet == true) {
                    innerList.set(cursor, e);
                } else {
                    throw new IllegalStateException();
                }
            }

            @Override
            public void add(E e) {
                if (innerList.get(cursor + 1) == null) {
                    innerList.set(cursor + 1, e);
                }
                canBeRemovedOrSet = false;
            }
        };
    }

    @Override
    public boolean add(E e) {
        return innerList.add(e);
    }

    @Override
    public boolean add(int index, E element) {
        return innerList.add(index, element);
    }

    @Override
    public void clear() {
        innerList.clear();
    }

    @Override
    public boolean contains(E element) {
        return innerList.contains(element);
    }

    @Override
    public E get(int index) {
        return innerList.get(index);
    }

    @Override
    public E set(int index, E element) {
        return innerList.set(index, element);
    }

    @Override
    public int indexOf(E element) {
        return innerList.indexOf(element);
    }

    @Override
    public boolean isEmpty() {
        return innerList.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.listIterator();
    }


    @Override
    public E remove(int index) {
        return innerList.remove(index);
    }

    @Override
    public boolean remove(E e) {
        return innerList.remove(e);
    }

    @Override
    public int size() {
        return innerList.size();
    }
};
