package exception.basic.checked;

/**
 * Client로 부터 받은 예외를 잡아서 처리하는 Service
 */
public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 잡지 않고 밖으로 던지는 코드
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
