package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;
    // 어떤 종료의 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드를 보관

    public NetworkClientExceptionV2(String errorCode, String message){
        super(message);
        // 오류 메세지에는 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 담음
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
