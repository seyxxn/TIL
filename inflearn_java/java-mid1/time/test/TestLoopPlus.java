package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);

//        System.out.println("날짜 1: " + startDate);
//        for(int i = 2; i <= 5; i++){
//            startDate = startDate.plusWeeks(2);
//            System.out.println("날짜 " + i + ": " + startDate);
//        }

        for(int i = 0; i < 5; i++){
            LocalDate nextDate = startDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + ": " + nextDate);
        }
    }
}
