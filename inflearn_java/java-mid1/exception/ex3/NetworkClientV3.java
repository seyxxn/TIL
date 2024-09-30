package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 { // 체크예외이기 때문에 반드시 명시
        if (connectError){
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError){
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: "+data);
//            throw new RuntimeException("ex"); // 알수없는오류 출력을 위해 잠시 RuntimeException을 터뜨려봄
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError =  true;
        }
    }
}

/**
 * 기존의 V2에서는 계속 NetworkClientExceptionV2만 예외를 터뜨림.
 * -> V3에서는 ConnectException과 SendException을 만들어두었기 때문에
 *    예외가 세분화되어 발생함.
 *    오류코드로 어떤 문제가 발생했는지 이해하는 것이 아니라, 예외 그 자체로 어떤 오류가 발생했는지 알 수 있게 됨.
 */