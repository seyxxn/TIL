package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토박싱됨
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 이후에 Double, Boolean을 포함한 다양한 타입을 담는 박스가 필요하다면 ..?
        // 각 타입별로 모두 클래스를 새로 만들어야 함 ..
        // -> 이러한 문제를 어떻게 해결할 수 있을까?
        // -> Object는 모든 객체의 부모 객체이므로 Object를 활용해보자
    }
}
