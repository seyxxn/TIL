package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java").delete(4,8).reverse().toString();

        // 메서드체인닝을 사용하면 이렇게 간단하게 할 수 있음

        System.out.println("string = " + string);
    }
}
