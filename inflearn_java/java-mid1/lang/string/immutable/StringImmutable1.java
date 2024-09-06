package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // hello 출력

        // 왜 합쳐지지 않았을까?
        // -> String은 불변객체임 !!
    }
}
