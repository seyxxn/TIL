package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입이 결정됨
        integerBox.set(10); // Integer 타입만 허용함
//        integerBox.set("문자100"); -> 컴파일 오류 발생
        Integer integer = integerBox.get(); // Integer 타입 변환 (캐스팅 필요 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
//        stringBox.set(10); -> 컴파일 오류 발생
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
//        GenericBox<> integerBox3 = new GenericBox<Integer>(); -> 이렇게는 안됨

    }
}
