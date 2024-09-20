package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;
            @Override
            public void print(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡쳐를 해야하나 ?
        // LocalPrinter를 생성하는 시점에 지역 변수인 localVar, paramVar를 캡쳐하는데
        // 캡쳐한 이후에 값을 변경하는 것은 컴파일 에러를 일으킴 ! -> 동기화 문제라고 함
        // localVar = 10; // 컴파일 에러
        // paramVar = 20; // 컴파일 에러

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

    }
}
