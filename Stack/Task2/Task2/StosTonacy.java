package Task2;

import Task1.EmptyStackException;
import Task1.FullStackException;

public class StosTonacy<T> implements IStack<T> {
    T array[];
    int topIndex = 0;
    int bottomIndex = 0;

    @SuppressWarnings("unchecked")
    public StosTonacy(int capacity) {
        array = (T[]) new Object[capacity + 1];
    }

    @Override
    public boolean isEmpty() {
        return bottomIndex == topIndex;
    }

    @Override
    public boolean isFull() {
        return bottomIndex == (topIndex + 1) % array.length;
    }

    @Override
    public T pop() throws EmptyStackException {
        T retValue;
        if (isEmpty()) throw new EmptyStackException();
        if (topIndex == 0) {
            retValue = array[array.length - 1];
            topIndex = array.length - 1;
            return retValue;
        }
        retValue = array[--topIndex];
        topIndex = topIndex % array.length;
        return retValue;
    }

    @Override
    public void push(T elem) throws EmptyStackException {
        if (isFull()) {
            array[bottomIndex] = null;
            bottomIndex++;
            bottomIndex = bottomIndex % array.length;
        }
        array[topIndex] = elem;
        topIndex++;
        topIndex = topIndex % array.length;
    }

    @Override
    public int size() {
        return (topIndex + array.length - bottomIndex) % array.length;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return array[bottomIndex];
    }

    public static void main(String[] args) throws FullStackException, EmptyStackException {
        StosTonacy stos = new StosTonacy(4);
        stos.push(1);
        stos.push(2);
        stos.push(3);
        stos.push(4);
        stos.push(5);
        stos.push(6);
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
    }
}
