package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double d1 = Double.parseDouble(array[0]);
        double d2 = Double.parseDouble(array[1]);
        double d3 = Double.parseDouble(array[2]);

        System.out.println("sum = " + (d1+d2+d3));
    }
}
