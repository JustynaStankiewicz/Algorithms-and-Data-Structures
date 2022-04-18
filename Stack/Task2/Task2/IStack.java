package Task2;

import Task1.EmptyStackException;
import Task1.FullStackException;

public interface IStack<T> {
    boolean isEmpty();

    boolean isFull();

    T pop() throws EmptyStackException;

    void push(T elem) throws FullStackException, EmptyStackException;

    int size();

    T top() throws EmptyStackException;
}
