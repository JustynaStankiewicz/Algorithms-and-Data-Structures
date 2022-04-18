package Task1;

public final class FilterIterator<T> implements Iterator<T> {
    private Iterator<T> iterator;
    private Predicate<T> predicate;

    private T elementNext = null;
    private boolean bHasNext = true;

    public FilterIterator(Iterator<T> iterator, Predicate<T> predicate) {
        super();
        this.iterator = iterator;
        this.predicate = predicate;
        findNextValid();
    }

    private void findNextValid() {
        while (iterator.hasNext()) {
            elementNext = iterator.next();
            if (predicate.accept(elementNext)) {
                return;
            }
        }
        bHasNext = false;
        elementNext = null;
    }

    @Override
    public boolean hasNext() {
        return bHasNext;
    }

    @Override
    public T next() {
        T nextValue = elementNext;
        findNextValid();
        return nextValue;

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
