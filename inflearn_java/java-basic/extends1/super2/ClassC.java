package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // super(); // 컴파일 오류
        // -> ClassB에서 직접 생성자를 정의해줬기 때문에 기본 생성자가 없다. 그래서 매개변수 없이 못만듦
        // 그래서 이런 경우에는 생략하면 안된다.. 직접 super 해야함
        super(10, 20);
        // ClassC를 상속하고 있는 ClassB에 기본생성자가 존재하지 않기 때문에 직접 super 해야함
        System.out.println("ClassC 생성자");
    }
}
