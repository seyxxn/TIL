package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2)); // false

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4)); // true

    }

    private static boolean isSame(String x, String y){
        // return x == y; -> 이렇게하면 출력값이 다름
        return x.equals(y);
    }

    // 항상 문자열 비교는 equals()로 등등성 비교를 해야 함 !
    // 문자열 풀이 들어올지 String 객체가 들어올지 모르기 때문에 ..
}
