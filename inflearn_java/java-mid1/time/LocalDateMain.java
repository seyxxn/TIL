package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산 (불변이기에 반환값 받아서 사용해야 함)
        LocalDate plusDays = ofDate.plusDays(10); // 10일 더하기
        System.out.println("지정 날짜+10d = " + plusDays);
    }
}
