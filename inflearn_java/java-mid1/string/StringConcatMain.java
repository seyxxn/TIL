package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println(result1);
        System.out.println(result2);
        // 같은 결과가 출력 됨
        // 즉, 문자열의 +는 concat과 같은 기능을 제공함 (문자열만 특별하게 제공)
    }
}
