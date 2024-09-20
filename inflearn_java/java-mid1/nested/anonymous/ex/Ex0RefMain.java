package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String str){
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println("Hello " + str); // str : 변하는 부분 (변하는 부분만 밖으로 뺌)
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
        // 변하는 부분과 변하지 않는 부분을 분리했더니 재사용성이 매우 높아짐
    }
}
