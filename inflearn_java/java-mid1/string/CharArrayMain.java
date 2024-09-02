package lang.string;

public class CharArrayMain {
    public static void main(String[] args) {
//        char a = '가';
//        System.out.println("a = " + a);
        // char은 하나의 문자밖에 담지 못함

        char[]  charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        // char 배열 변수를 만들어서 여러개를 담을 수 있음
        System.out.println(charArr); // hello 출력됨

        // 주로 String을 사용하여 문자열을 다룸
        String str = "hello";
        System.out.println(str);

    }
}
