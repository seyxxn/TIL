package lang.immutable.change;

public class ImmutableObj {
    private final int value; // 불변 객체

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변객체에서 값을 변경하는 방법
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        // 새로운 객체를 만들고, 그 객체를 반환하는 방법
    }

    public int getValue() {
        return value;
    }


}
