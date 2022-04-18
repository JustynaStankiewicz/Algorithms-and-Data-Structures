public class BottomOfStackException extends Exception {
    public BottomOfStackException() {
        super("Bottom was reached");
    }
}
