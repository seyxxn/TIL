package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); // 추상메서드이므로 추상 클래스여야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
