package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        // 이용가능한 존 아이디에 대한 정보를 얻음
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault(); // 현재 내 운영체제가 가지고있는 존 아이디
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul"); // 타임존을 직접 제공해서 ZoneId를 반환
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
