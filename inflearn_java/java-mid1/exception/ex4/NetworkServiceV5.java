package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)){
            // try-with-resources 사용을 위해 수정
            // -> 괄호 안에 사용할 자원을 명시해야 함
            //   try 블럭이 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제함
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){ // catch 없어도 자원 해제 가능함 (자원이 해제되는 시점을 확인하기 위해 넣은 코드)
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
        // finally 지움
    }
}

/**
 * 위 방법이 자원을 더 빨리 해제하기 때문에 좋음
 * 리소스 누수도 예방할 수 있음
 */
