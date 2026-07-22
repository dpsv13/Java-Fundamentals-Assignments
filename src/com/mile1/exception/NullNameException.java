package src.com.mile1.exception;

public class NullNameException extends Exception {

    public NullNameException() {
        super("Name is null");
    }

    public NullNameException(String message) {
        super(message);
    }
}
