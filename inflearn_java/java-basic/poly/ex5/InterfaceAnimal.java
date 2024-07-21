package poly.ex5;

public interface InterfaceAnimal {
    void sound();
    void move();

    // 인터페이스에서의 멤버변수는 public, static, final로 간주
    // 즉, 상수이다
    double MY_PI = 3.14;
}
