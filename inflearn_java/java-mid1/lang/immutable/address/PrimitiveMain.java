package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않음
        int a = 10;
        int b = a; // a -> b, 값을 복사 후에 대입함

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        b = 20; // b의 값을 변경했다
        System.out.println("20 -> b");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20
        // 값을 복사해서 넣는 것이지, 공유하는 것이 아니기에 b의 값만 변경됨

    }
}
