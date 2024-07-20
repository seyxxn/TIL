package extends1.super2;

public class ClassB  extends ClassA{
    public ClassB(int a) {
        // 상속을 받으면, 생성자의 첫줄에 super(...)을 사용해서 부모 클래스의 생성자를 호출해야 함
        super(); // 기본 생성자 생략 가능
        // ClassB를 상속하고있는 ClassA에 기본생성자가 존재하고 있어서 생략이 가능함
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b){
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }

    // 생성자를 정의해줬기 때문에 기본생성자를 제공해주지 않음
}
