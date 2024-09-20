package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;
        // 지역변수는 스택 프레임이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer{ // 지역 클래스
            int value = 0; // 지역 클래스 내의 지역 변수
            @Override
            public void print(){
                System.out.println("value= " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
        // process() 메서드가 종료된 이후에 main() 내에서 LocalPrinter.print()를 호출함
        // LocalPrinter 인스턴스에 있는 print() 메서드에서는 지역 변수인 paramVar, localVar를 접근해야하는데
        // process() 메서드가 이미 종료되었는데 어떻게 접근하여 출력 하는가 ?

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        // 눈에 보이는 필드는 value(내부 클래스) 하나 밖에 없지만,
        // 캡쳐를 통해 인스턴스가 생성될 때 필요한 지역변수를 모두 저장하기 때문에
        // localVar, paramVar이 모두 출력됨 (캡쳐를 통해 자바가 내부적으로 저장함)

        // + LocalOuterV3
        // -> 바깥 인스턴스를 참조하기 위한 필드
    }
}
