package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void hello(Process process){ // 인스턴스를 던지고
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run(); // 인스턴스 내에 있는 메서드를 호출함
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        // 익명클래스로 변경했음
        Process dice = new Process() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + random);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for(int i = 1; i <= 3; i++){
                    System.out.println("i = " + i);
                }
            }
        };

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
