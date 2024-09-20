package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1; // 메서드 내의 지역 변수

        class LocalPrinter{ // 지역 클래스
            int value = 0; // 지역 클래스 내의 지역 변수
            public void printData(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar); // 지역변수에 접근 가능
                System.out.println("paramVar=" + paramVar); // 매개변수에도 접근 가능
                System.out.println("outInstanceVar= " + outInstanceVar);
                // 지역 클래스도 바깥 인스턴스에 소속이 되기 때문에 바깥 인스턴스의 변수에 접근이 가능함
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
