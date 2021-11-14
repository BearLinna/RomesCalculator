public class NotRelevantNumException extends Exception{
    public NotRelevantNumException() {
    }

    public NotRelevantNumException(String message) {
        super(message);
    }

    public NotRelevantNumException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRelevantNumException(Throwable cause) {
        super(cause);
    }

    public NotRelevantNumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
