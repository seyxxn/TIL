package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        // 인스턴스 생성 없이 클래스에서 바로 호출해봄

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
