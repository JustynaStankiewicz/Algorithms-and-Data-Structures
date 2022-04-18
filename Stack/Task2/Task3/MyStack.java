package Task3;

import Task1.EmptyStackException;
import Task1.IStack;

import java.util.Iterator;

public class MyStack<T> implements IStack<T>, Iterable<T> {
    int topIndex;
    T array[];

    public MyStack(int size) {
        array = (T[]) new Object[size];
        topIndex = 0;
    }


    @Override
    public boolean isEmpty() {
        return topIndex == 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == array.length;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[--topIndex];
    }

    @Override
    public void push(T elem) {
        if (topIndex == (3 / 4) * array.length) {
            resize(2 * array.length);
        }
        array[topIndex++] = elem;
    }

    @Override
    public int size() {
        return topIndex;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (topIndex == (1 / 4) * array.length) {
            resize((1 / 2) * array.length);
        }
        return array[topIndex - 1];
    }

    public void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < topIndex; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public static void main(String[] args) throws EmptyStackException {
        MyStack<Integer> stos = new MyStack<Integer>(4);
        stos.push(1);
        stos.push(3);
        stos.push(2);
        stos.push(4);
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        stos.push(5);

        for (int liczba : stos) {
            System.out.println(liczba);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorStack<>();
    }

    private class IteratorStack<T> implements Iterator<T> {
        int cursor = topIndex;

        @Override
        public boolean hasNext() {
            return cursor > 0;
        }

        @Override
        public T next() {
            return (T) array[--cursor];
        }
    }
}
