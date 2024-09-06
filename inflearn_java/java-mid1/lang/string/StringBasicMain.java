package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; // 기존
        String str2 = new String("hello"); // 변경 (자바에서 이렇게 변경해서 해줌)
        // 위의 두가지 방법 모두 가능함

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
