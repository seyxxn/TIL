package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        // add 메서드를 여러번 호출해서 누적하여 더함

        // 여기에서는 반환을 했음

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
        // 참조값이 모두 동일함 -> 즉, 같은 것을 가리키고 있음
    }
}
