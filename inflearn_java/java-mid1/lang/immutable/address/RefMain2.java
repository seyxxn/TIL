package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        // 참조값 대입을 막을 수 있는 방법은 없음

        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 서울

        // b.setValue("부산");
        // setValue가 없기 때문에 에러발생함, 그리고 final이라서 바꾸지 못함

        b = new ImmutableAddress("부산");
        // 새로운 객체를 생성해서 b가 참조하게 하면 된다

        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 부산
    }
}
