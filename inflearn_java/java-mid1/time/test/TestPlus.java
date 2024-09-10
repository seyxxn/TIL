package time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + now);

//        LocalDateTime after = now.plus(1, ChronoUnit.YEARS);
//        after = after.plus(2, ChronoUnit.MONTHS);
//        after = after.plus(3, ChronoUnit.DAYS);
//        after = after.plus(4, ChronoUnit.HOURS);
        LocalDateTime after = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("1년 2개월 3일 4시간 후의 시각: " + after);
    }
}
