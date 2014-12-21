package jp.isakmp2spring.booklist.domain.common.exception;

public class ResourceNotFoundException extends RuntimeException {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
