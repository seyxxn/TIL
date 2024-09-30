package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException{
    // 언체크예외이기에 RuntimeException을 상속받아야 함
    public NetworkClientExceptionV4(String message){
        super(message);
    }
}
