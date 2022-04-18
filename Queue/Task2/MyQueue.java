package Task1;

public class MyQueue<E> implements IQueue<E> {
    OneWayLinkedListWithHead<E> list;
    int beginIndex;
    int endIndex;

    public MyQueue(OneWayLinkedListWithHead list) {
        this.list = list;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return list.remove(0);
    }

    @Override
    public void enqueue(E elem) {
        list.add(elem);
    }

    @Override
    public int size() {
        return list.size();
    }

    public static void main(String[] args) throws FullQueueException, EmptyQueueException {
        OneWayLinkedListWithHead list = new OneWayLinkedListWithHead();
        list.add(1);
        list.add(2);
        list.add(3);
        MyQueue queue = new MyQueue(list);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        list.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("\n");
        list.print();


    }


}
