package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class TestZone {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoulZdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간: " + seoulZdt);

        ZonedDateTime londonZdt = seoulZdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간: " + londonZdt);

        ZonedDateTime newYoukZdt = seoulZdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의시간: " + newYoukZdt);
    }
}
