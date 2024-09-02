package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1); // hello 출력
        System.out.println("str2 = " + str2);

        // 변경이 필요한 경우 새로운 변수로 받아서 사용해야 함
    }

    // String이 불변으로 설계된 이유 ?
    // -> String 인스턴스의 값이 중간에 변경되어버리면, 같은 문자열을 참고하는 다른 변수의 값도 함꼐 변경됨
    // 만약, String이 불변객체가 아니라면 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생하기에
    // 사이드 이펙트 문제를 발생시키지 않기 위해서 불변 객체로 설계되었음
}
