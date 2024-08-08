package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // add 했는데

        System.out.println("obj1 = " + obj1.getValue()); // 10
        // 값이 변하지 않음
        // 왜 ?? 기존 것은 바뀌지 않기 때문에
    }
}
