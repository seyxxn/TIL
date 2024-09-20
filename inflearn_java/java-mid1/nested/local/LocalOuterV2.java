package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1; // 메서드 내의 지역 변수

        class LocalPrinter implements Printer{ // 지역 클래스 선언
            int value = 0; // 지역 클래스 내의 지역 변수
            @Override
            public void print(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter(); // 지역 클래스 생성
        printer.print();

        // 지역 클래스는 선언과 생성이 분리가 되어있음
        // -> 익명 클래스는 선언과 생성을 동시에 할 수 있음
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
