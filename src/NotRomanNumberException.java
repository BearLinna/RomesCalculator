public class NotRomanNumberException extends Exception{
    public NotRomanNumberException() {
    }

    public NotRomanNumberException(String message) {
        super(message);
    }

    public NotRomanNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRomanNumberException(Throwable cause) {
        super(cause);
    }

    public NotRomanNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
