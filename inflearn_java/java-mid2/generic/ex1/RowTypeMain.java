package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox<>(); // -> 이렇게 앞에 <> 안넣을수도 있음
        // GenericBox<Object> integerBox = new GenericBox<>();
        integerBox.set(10); // 이렇게하면 Object 타입이 됨
        Object object = integerBox.get();
        System.out.println("object = " + object);

        // <>를 지정하지 않은 것을 로 타입 또는 원시 타입이라고 함
        // 원시타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 됨
    }
}
