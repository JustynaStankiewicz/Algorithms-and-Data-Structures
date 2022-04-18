import java.util.EmptyStackException;


public class MyStack<T> implements IStack<T> {
    private static final int DEFAULT_CAPACITY = 16;
    T array[];
    int topIndex = 0;
    int bottomIndex = 0;

    //konstruktor
    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        array = (T[]) (new Object[capacity + 1]);

    }

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    //metody
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
        if (isEmpty() == true) {
            throw new EmptyStackException();
        }
        T retValue = array[bottomIndex];
        array[bottomIndex] = null;
        bottomIndex = (bottomIndex + 1) % array.length;
        return retValue;
    }

    @Override
    public void push(T element) {
        if (isFull() == true) {
            this.pop();
        }
        array[topIndex] = element;
        topIndex = (topIndex + 1) % array.length;
    }

    @Override
    public int size() {
        return array.length - 1;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return array[topIndex - 1];
    }
}
