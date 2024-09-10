package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        // 입력받은 월의 첫날 요일과 마지막날 요일
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1); // 날짜 생성
        DayOfWeek firstDayOfWeek = date.getDayOfWeek(); // 1일
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek(); // 마지막 날짜

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
