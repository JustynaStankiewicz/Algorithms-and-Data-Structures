package Task1;

public interface IQueue<E> {
    boolean isEmpty();
    //boolean isFull();
    E dequeue() throws EmptyQueueException;
    void enqueue(E elem) throws FullQueueException;
    int size();
    //E first() throws EmptyQueueException;
}
