package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자에서 초기화한 예
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        // 인스턴스마다 넣어줌

        System.out.println(constructInit1.value); // 10
        System.out.println(constructInit2.value); // 20

        // final 필드 - 필드에서 초기화 한 에
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        // 모든 값이 모두 10으로 출력 (final 필드에 이미 초기화를 했기 때문에)
        // final 필드를 필드에서 초기화하는 경우 모두 같은 값을 가지기 때문에 의미가 없음
        // -> 이때 사용하면 좋은 것이 static 이다.
        // 같은 값을 가지는데 모두 다 메모리를 쓰기때문에 낭비이기 때문 !
        // -> 따라서 static final을 쓰면 됨 (바뀌지 않는 공용 번수가 됨)

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);


    }
}
