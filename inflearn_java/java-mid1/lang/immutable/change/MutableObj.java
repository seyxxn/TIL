package lang.immutable.change;

public class MutableObj {
    private int value; // 가변

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
