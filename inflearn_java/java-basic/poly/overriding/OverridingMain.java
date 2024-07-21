package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        // 오버라이드된 메소드가 호출된다

        // 부모 변수가 부모 인스턴스를 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        // 당연히 부모 메서드 호출

        // 부모 변수가 자식 인스턴스를 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 부모값 출력
        poly.method(); // 자식 메서드(오버라이딩된거) 호출
        // 변수는 오버라이딩이 되지않고, 메서드는 오버라이딩 됨

    }
}
