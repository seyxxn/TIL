package exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 { // 상속받음
    private final String sendData; // 전송을 시도한 데이터 보관

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
