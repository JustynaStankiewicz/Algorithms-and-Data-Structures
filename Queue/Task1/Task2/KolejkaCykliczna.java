package Task2;

public class KolejkaCykliczna<T> implements IQueue<T> {
    T array[];
    int beginIndex;
    int endIndex;

    @SuppressWarnings("unchecked")
    public KolejkaCykliczna(int size){
        array=(T[])new Object[size +1];
    }

    @Override
    public boolean isEmpty() {
        return beginIndex==endIndex;
    }

    @Override
    public boolean isFull() {
        return beginIndex==(endIndex+1)% array.length;
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException();
        T retValue = array[beginIndex++];
        beginIndex=beginIndex%array.length;

        return retValue;
    }

    @Override
    public void enqueue(T elem) throws FullQueueException {
        if(isFull()) throw new FullQueueException();
        array[endIndex++]=elem;
        endIndex=endIndex% array.length;
    }

    @Override
    public int size() {
        return (endIndex+ array.length-beginIndex)% array.length;
    }

    @Override
    public T first() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException();
        return array[beginIndex];
    }

    public static void main(String[] args) throws FullQueueException, EmptyQueueException {
        KolejkaCykliczna kolejkaCykliczna = new KolejkaCykliczna(5);
        kolejkaCykliczna.enqueue(1);
        kolejkaCykliczna.enqueue(2);
        kolejkaCykliczna.enqueue(3);
        kolejkaCykliczna.enqueue(4);
        kolejkaCykliczna.enqueue(5);
        System.out.println(kolejkaCykliczna.dequeue());
        System.out.println(kolejkaCykliczna.dequeue());
        System.out.println(kolejkaCykliczna.dequeue());
        System.out.println(kolejkaCykliczna.dequeue());
        System.out.println(kolejkaCykliczna.dequeue());



    }
}
