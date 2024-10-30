package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자100"); // 기대했던 타입인 Integer이 아니라 문자가 들어온 경우
        // Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생 !
        // System.out.println("result = " + result);

        // 다형성을 활용한 덕분에 코드의 중복을 제거하고 기존 코드를 재사용할 수 있게 되었지만,
        // 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생함 !

        // 코드 재사용 문제, 타입 안전성 문제 -> 2가지 문제를 모두 해결할 수 있는 제네릭 활용
    }
}
