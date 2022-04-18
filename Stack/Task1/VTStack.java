import java.util.EmptyStackException;


public class VTStack<T> extends MyStack<T> {
    int cursor = 0;

    //konstruktor
    @SuppressWarnings("unchecked")
    public VTStack(int capacity) {
        super(capacity);

    }

    public VTStack() {
        super();
    }

    //metody
    public T pop() throws EmptyStackException {
        if (isEmpty() == true) {
            throw new EmptyStackException();
        }
        if (topIndex == 0) {
            cursor = size();
        } else cursor = topIndex - 1;

        return super.pop();
    }

    public void push(T e) {
        super.push(e);
        if (topIndex == 0) {
            cursor = size();
        } else cursor = topIndex - 1;

    }

    public T peek() {
        if (isEmpty() == true) {
            throw new EmptyStackException();
        }
        T retValue = super.array[cursor];
        return retValue;
    }

    public void toTop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            if (topIndex == 0) {
                cursor = size();
            } else cursor = topIndex - 1;
        }
    }

    public void down() throws BottomOfStackException {
        if (cursor == bottomIndex) {
            throw new BottomOfStackException();
        } else {
            if (cursor == 0) {
                cursor = size();
            } else cursor--;
        }
    }

}
