package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process){ // 인스턴스를 던지고
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run(); // 인스턴스 내에 있는 메서드를 호출함
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int random = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + random);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for(int i = 1; i <= 3; i++){
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}