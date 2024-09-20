package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void hello(Process process){ // 인스턴스를 던지고
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run(); // 인스턴스 내에 있는 메서드를 호출함
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        System.out.println("Hello 실행");

        // 인수로 바로 전달한 방법
        hello(new Process() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + random);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for(int i = 1; i <= 3; i++){
                    System.out.println("i = " + i);
                }
            }
        });
        // 코드 조각을 전달하기 위해 클래스를 정의하고 메서드를 만들고,
        // 또, 인스턴스를 꼭 생성해서 전달해야할까?
        // 클래스나 인스턴스와 관계없이 메서드만 전달할 수 있다면 ..?
        // -> 자바8부터는 함수를 인수로 전달할 수 있게 됨 (람다)
    }
}
