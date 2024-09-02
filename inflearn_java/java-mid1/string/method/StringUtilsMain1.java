package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        // -> 무언가 다른 자료형을 문자열로 바꿔주는 것
        String numString = String.valueOf(num); // 숫자를 문자로 바꿈
        System.out.println("숫자의 문자열 값: " + numString);

        String boolString = String.valueOf(bool); // 불리언형을 문자로 바꿈
        System.out.println("불리언의 문자열 값: " + boolString);

        String objString = String.valueOf(obj); // 객체를 문자로 바꿈
        System.out.println("객체의 문자열 값: " + objString);

        // 문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println("빈문자열 + num: " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        // 이렇게하면 참조값이 출력됨

        System.out.println(strCharArray); // 이렇게 해야 값만 잘 출력
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();

    }
}
