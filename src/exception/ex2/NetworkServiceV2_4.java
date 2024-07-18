package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 " + e.getErrorCode() + ", 메세지: " + e.getMessage());

            //throw new RuntimeException("ex");
        }

        client.disconnect();
    }

    /* 리펙토링 */
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
