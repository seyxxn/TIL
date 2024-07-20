package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    // move를 새로 재정의했음 -> 메소드 오버라이딩 (부모의 기능을 새로 재정의)

    public void charge(){
        System.out.println("충전합니다.");
    }
}
