package exception.ex2;

public class NetworkClientV2 {
    private final String address; // 접근할 외부 서버의 주소
    public boolean connectError; // 연결 실패
    public boolean sendError; // 전송 실패


    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { // 체크예외이기 때문에 반드시 명시
        if (connectError){
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError){
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);

            // 중간에 다른 예외가 발생했다고 가정
//            throw new RuntimeException("ex");
        }
        // 전송 성공
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
 * 오류기 발생했으 때, 오류 코드를 반환하는 것이 아니라 예외를 던짐
 * -> 따라서, 반환 값을 사용하지 않아도 됨. 여기서는 반환 값을 void로 처리함
 *    이전에는 반환 값으로 성공, 실패 여부를 확인해야했지만, 예외 처리 덕분에 메서드가 정상 종료되면 성공,
 *    예외가 던져지면 예외를 통해 실패를 확인함
 * 오류가 발생하면, 예외 객체를 만들고 그 객체에 오류코드와 오류메세지를 담음. 그리고 만든 예외 객체를 throw를 통해 던짐
 */
