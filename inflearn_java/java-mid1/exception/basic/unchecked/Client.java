package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
        // throws를 (예외를 던지는 키워드) 명시하지 않아도 에러가 발생하지 않음
        // => 언체크예외는 throws를 명시하지 않아도 자동으로 예외가 던져짐
    }
}
