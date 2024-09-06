package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자를 래퍼 클래스로 변환
        Integer i2 = Integer.valueOf("10"); // 문자열을 래퍼 클래스로 변환
        int intValue = Integer.parseInt("10");// 문자열 전용, 기본형으로 변환

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));


    }
}
