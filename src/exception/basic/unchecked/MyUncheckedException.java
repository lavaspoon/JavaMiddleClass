package exception.basic.unchecked;

/**
 * 언체크 예외
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
