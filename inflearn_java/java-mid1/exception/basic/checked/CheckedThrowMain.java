package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        // catchThrow()를 호출 -> call()을 호출 -> call()에서 예외를 발생시켰는데 해결하지 않고 던짐
        // -> catchThrow()로 다시 감 -> 근데 여기서도 해결하지 못하고 던짐 -> 결국 main으로 옴
        // -> 여기서도 해결하지 않고 있음 -> 에러 발생 !
        // throws MyCheckedException 하면 에러 해결 됨
        // =>> 이렇게 되면 자바가 어디서 에러가 발생했는지 메세지를 출력하고 종료해줌
        System.out.println("정상 종료");
    }
}
