package Task1;

public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}
