package Task2;

public class FullQueueException extends Exception {
    public FullQueueException(){
        super("Kolejka jest pelna");
    }
}
