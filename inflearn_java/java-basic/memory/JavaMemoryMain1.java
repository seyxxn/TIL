package memory;

// 스택 구조로 실행된다
// 가장 먼저 실행시킨것이 가장 늦게 끝남
public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

    }

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
