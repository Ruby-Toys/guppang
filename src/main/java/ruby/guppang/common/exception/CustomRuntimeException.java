package ruby.guppang.common.exception;

public abstract class CustomRuntimeException extends RuntimeException{
    public CustomRuntimeException(String message) {
        super(message);
    }

    public abstract int getStatusCode();
}
