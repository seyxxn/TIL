package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ // throws 예외 -> 발생시킨 예외를 메서드 밖으로 던진다
        // 문제 상황
        throw new MyCheckedException("ex");
        // throw 예외 -> 새로운 예외를 발생시키기
        // 예외도 객체이기에 new로 생성하고 예외를 발생시켜야 함
    }
}
