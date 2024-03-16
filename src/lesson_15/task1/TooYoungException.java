package lesson_15.task1;

public class TooYoungException extends RuntimeException{

    public TooYoungException() {
    }

    public TooYoungException(String message) {
        super(message);
    }
}
