package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // 2번 사용했던 tyy-catch문을 1번으로 합침
        try {
            client.connect();
            client.send(data);
            client.disconnect(); // 예외 발생시 무시 된다
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        // try 안에 정상흐름
        // catch 안에 예외흐름
        // -> 완벽하게 분리됨
    }
}
