package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound(); // 추상메서드이므로 추상 클래스여야함

    public abstract void move();
    // 모든 메서드를 추상 메서드로 바꿨다.
    // -> 순수추상클래스가 됨

    // 순수 추상 클래스는 실행 로직을 전혀 가지고 있지 X, 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공 !
    // 순수 추상 클래스는 마치 어떤 규격을 지켜서 구현해야하는 것 처럼 느껴진다
    // 일반적으로 '인터페이스'와 같이 느껴짐.
    // -> 따라서, 순수 추상 클래스를 더 편리하게 사용할 수 있도록 '인터페이스' 개념을 제공함 !
}
