package exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            // throw new RuntimeException("ex");이 발생하면 catch를 못함
            // 자동으로 밖으로 던져지기에 예외 출력하면서 프로그램이 종료 됨
            // 1. RuntimeException은 catch 대상이 아님.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect();
        // 이렇게하면 오류가 발생해도 무조건 연결이 해제됨
        // 하지만, 이 방식의 문제점은
        // catch에서 잡을 수 없는 예외가 발생하는 경우에 문제점이 있음
        // 2. 이 코드는 호출되지 않음

        // 정상적인 상황, 예외 상황, 어딘가 모르는 예외를 밖으로 던지는 상황 .. 등 여러 상황을 고려해야 하기 때문에
        // 사용 후에 반드시 disconnect()를 호출해서 연결 해제를 보장하는 것은 쉽지 않음

    }
}
