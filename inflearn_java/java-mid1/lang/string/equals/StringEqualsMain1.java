package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("new String() == 비교: " + (str1 == str2)); // false (참조값이 달라서)
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true (논리적으로 같은 문자열)

        // 문자열의 내용이 같은지 비교하려면 equals()를 사용해야 함 (논리적인 비교)
        // 같은 객체를 가리키고 있는지를 비교하려면 == 를 사용 (물리적 비교)

        // 리터럴로 정의
        String str3 = "hello"; // 이떄 문자열 풀에 인스턴스 만든다
        String str4 = "hello"; // 위에서 만든것 이미 있으니까 새로 만들지 않음
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true

        // 이건 왜 둘다 true일까 ?
        // -> 자바는 문자열 리터럴을 사용하는 경우, 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용하는데
        // 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만든다
        // 이때, 같은 문자열이 있으면 만들지 X !!

        // 그래서 같은 문자열 리터럴을 사용하므로 같은 객체를 가리키게 됨

    }
}
