package lesson_15.task1;

public class TooOldException extends Exception{

    public TooOldException() {
    }

    public TooOldException(String message) {
        super(message);
    }
}
