
import java.util.EmptyStackException;

public interface IStack<T> {
    boolean isEmpty();

    boolean isFull();

    T pop() throws EmptyStackException;

    void push(T element) throws FullStackException;

    int size();

    T top() throws EmptyStackException;
}
