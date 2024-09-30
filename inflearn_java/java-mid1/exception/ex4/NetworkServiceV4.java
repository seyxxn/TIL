package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}

/**
 * NetworkServiceV4는 발생하는 에러인 ConnectExceptionV4, SendExceptionV4를 잡아도 해당 오류를 해결할 수 없음
 * -> 따라서, 예외를 밖으로 던질 것임
 *    언체크 예외이기 때문에 throws를 사용하지 않아도 됨
 *    해당 예외들을 생각하지 않는 것이 더 나은 선택이기 때문에 이런 방식을 선택할 수 있음
 */
