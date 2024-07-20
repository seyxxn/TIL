package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();

        // 최상위 부모부터 실행되면서 하나씩 아래로 내려옴
        // ClassA -> ClassB -> ClassC
    }
}
