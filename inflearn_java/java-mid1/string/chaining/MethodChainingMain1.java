package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        // add 메서드를 여러번 호출해서 누적하여 더함

        // 여기에서는 반환을 하지 않았음

        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
