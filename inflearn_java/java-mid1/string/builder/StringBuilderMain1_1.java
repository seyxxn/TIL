package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder는 불변이 아닌 가변이기에
        // 따로 반환하지 않아도 출력이 할 수 있음

        // 가변으로 계속 바꾸다가 마지막에 불변으로 바꿀 수 있음
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
