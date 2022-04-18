package Task2;

public class EmptyQueueException extends Exception {
    public EmptyQueueException(){
        super("Kolejka jest pusta");
    }
}
