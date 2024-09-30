package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가된 코드

        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> 오류다 (리팩토링하자)
        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        }else{
            String sendResult = client.send(data);
            if (isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect(); // 연결 해제를 반드시 호출함
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
