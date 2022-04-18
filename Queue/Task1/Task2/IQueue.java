package Task2;

public interface IQueue<T> {
    boolean isEmpty();
    boolean isFull();
    T dequeue()  throws EmptyQueueException;
    void enqueue(T elem) throws FullQueueException;
    int size();//zwraca liczbe elementow w kolejce
    T first() throws EmptyQueueException; //zwraca element z poczatku kolejki bez usuwani go
}
