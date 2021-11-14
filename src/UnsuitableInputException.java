public class UnsuitableInputException extends Exception{
    public UnsuitableInputException() {
    }

    public UnsuitableInputException(String message) {
        super(message);
    }

    public UnsuitableInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsuitableInputException(Throwable cause) {
        super(cause);
    }

    public UnsuitableInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
