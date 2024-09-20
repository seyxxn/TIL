package nested.anonymous;

import nested.local.Printer;

import java.io.FilterOutputStream;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        Printer printer = new Printer() { // 익명 클래스 -> 생성하면서 바로 구현하기
            // new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 됨
            // 마치 인터페이스 Printer를 생성하는 것 처럼 보이지만, 인터페이스를 생성하는 것이 아니고
            // Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것.
            // {body} 부분에 Printer 인터페이스를 구현한 코드를 작성하면 됨

            // 인터페이스는 부모클래스를 상속받거나 또는 인터페이스를 구현해야 함

            int value = 0;

            @Override
            public void print(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class= " + printer.getClass());
        // 익명 클래스는 이름이 없기때문에 바깥클래스이름+$+1, +$2 이런식으로 출력됨
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);
    }
}
