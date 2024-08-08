package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 이렇게하면, 계산 이후에도 기존 값과 신규 값을 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue()); // 10
        System.out.println("obj2 = " + obj2.getValue()); // 30


    }
}
