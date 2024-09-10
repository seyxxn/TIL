package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        // 입력받은 달의 날짜를 생성
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        // 기준이 되는 끝 날의 날짜를 생성 (다음달 직전까지 출력할 것임)

        // 월요일 = 1 (1%7=1)... 일요일 = 7 (7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        // 처음에 몇 칸을 띄우고 시작할지에 대한 오프셋 변수
        // 첫번째 날짜의 요일만큼 처음에 띄어야함

        System.out.println("Su Mo Tu We Th Fr Sa "); // 일 월 화 수 목 금 토

        for(int i = 0; i < offsetWeekDays; i++){
            System.out.print("   "); // 공백 3칸
        }

        LocalDate dayIterator = firstDayOfMonth; // 첫날을 기점으로 반복해서 출력할 예정
        while (dayIterator.isBefore(firstDayOfNextMonth)){ // 다음달의 전날이 될때까지 반복문 출력
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 간격에 맞춰서 출력 (printf를 사용함)
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){ // 토요일인 경우 개행 출력
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1); // 다음날로 바꿔주기 (반드시 필요**)
        }
    }
}
