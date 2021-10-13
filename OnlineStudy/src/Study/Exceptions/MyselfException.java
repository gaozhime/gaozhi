package Study.Exceptions;

public class MyselfException extends RuntimeException {
    public MyselfException() {
        super();
    }

    public MyselfException(String message) {
        super(message);
    }

    public MyselfException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyselfException(Throwable cause) {
        super(cause);
    }

    protected MyselfException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
