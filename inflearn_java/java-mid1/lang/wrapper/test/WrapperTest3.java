package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str); // String을 Integer로 변환
        System.out.println("integer1 = " + integer1);

        int intValue = integer1; // Integer를 int로 변환 (오토 언박싱)
        System.out.println("intValue = " + intValue);

        Integer integer2 = intValue; // int를 Integer로 변환 (오토 박싱)
        System.out.println("integer2 = " + integer2);
    }
}
