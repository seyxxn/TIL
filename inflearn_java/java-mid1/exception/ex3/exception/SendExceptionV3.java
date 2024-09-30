package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3{ // 상속받음
    private final String sendData; // 전송을 시도한 데이터 보관

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
