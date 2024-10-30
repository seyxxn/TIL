package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i); // Object를 반환함
        //Integer result = (Integer) GenericMethod.objMethod(i); // Integer로 반환하려면 캐스팅이 필요함

        // 타입인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론이 되기 때문에 < > 생략이 가능함 !
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}

// 제네릭 타입
    // GenericClass<T>
    // 타입인자전달 : 객체를 생성하는 시점
        // new GenericClass<String>

// 제네릭 메서드
    // <T> T genericMethod(T t)
    // 타입인자전달 : 메서드를 호출하는 시점
        // GenericMethod.<Integer>genericMethod(i)