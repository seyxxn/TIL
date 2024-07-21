package poly.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        // Child child1 = parent1; -> 이렇게 하면 안된다

        Child child1 = (Child) parent1;
        child1.childMethod();
        // 하지만 이렇게하면 된다

        Parent parent2 = new Parent();
        // Parent를 만들었기에.. 메모리 상에 자식 타입이 애초에 존재하지를 않음
        Child child2 = (Child) parent2;
        // 여기서 오류가 터짐. 런타임 오류 - ClassCastException
        // Parent2는 Parent로 생성되었기에, 메모리 상에 Child 자체가 존재하지 않음
        // 따라서 Child 자체를 사용할 수 없다
        // 자바에서는 사용할 수 없는 타입으로 다운캐스팅하는 경우에 ClassCastException이라는 예외를 발생시킴
        // 예외가 발생하면 다음 동작이 실행되지 않고, 프로그램이 종료 됨
        child2.childMethod();
        // 결국 실행하면 오류가 뜬다
    }
}
