package lang.immutable.address;

public class ImmutableAddress {
    private final String value; // 값의 변경을 막기 위해 final로 

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
