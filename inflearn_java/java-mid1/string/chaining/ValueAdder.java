package lang.string.chaining;

// 단순히 값을 누적해서 더하는 기능을 제공하는 클래스
public class ValueAdder {
    private int value; // 이 변수에 값을 누적시킨다

    public ValueAdder add(int addValue){
        value += addValue;
        return this; // 나 자신을 반환 (자기 자신의 참조값을 반환)
    }

    public int getValue() {
        return value;
    }
}
