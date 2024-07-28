package exception.ex4.exception;

public class ConnecntExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnecntExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
