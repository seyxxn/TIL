package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

        // adder에서 add가 자기 자신을 호출하기 때문에
        // .으로 계속해서 체인처럼 메서드를 호출할 수 있음

    }
}
