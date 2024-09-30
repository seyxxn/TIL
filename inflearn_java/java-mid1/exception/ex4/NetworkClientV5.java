package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{
    // AutoCloseable 인터페이스 구현
    // -> finally를 명시하지 않아도 외부 자원을 해제할 수 있도록 하는 편의 기능 제공
    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect(){
        if (connectError){
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        if (sendError){
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: "+data);
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

    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}