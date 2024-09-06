package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currnetTimeNano = System.currentTimeMillis();
        System.out.println("currnetTimeNano = " + currnetTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        // for문으로 직접 돌리지 않아도 통째로 읽어서 복사해줌 (속도가 빠름)
        // 자바에서 하는게 아니고, 자바에서 운영체제에 넘겨서 하드웨어 쪽에서 처리

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 0으로 종료하는 것은 정상 종료를 의미함
        // 가급적으로 사용하지 않는 것이 좋음
    }
}
