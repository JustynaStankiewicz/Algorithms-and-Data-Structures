package Task1;

public class MyStack<T> implements IStack<T> {
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
    public void push(T elem) throws FullStackException {
        if (isFull()) {
            throw new FullStackException();
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
        return array[topIndex - 1];
    }
}
