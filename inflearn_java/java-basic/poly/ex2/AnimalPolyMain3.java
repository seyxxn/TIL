package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        // 1번문제. 이 코드가 동작한다 ..! 그런데 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상한 일이다..

        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for(Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 아직까지도 2가지 문제가 존재함
    // 1. Animal 클래스를 생성할 수 있는 문제
    // Animal 클래스를 직접 생성해서 사용할 일은 없다.
    // 다형성을 위해서 필요한 것이지, 직접 인스턴스를 생성해서 사용할 일은 없다 !
    // 누군가 실수로 생성할 수 있다는 문제점이 존재한다는 것이다.

    // 2. Animal 클래스를 상속 받는 곳에서 sound() 메서드를 오버라이딩하지 않을 가능성이 있다
    // 자식 클래스에서 당연히 있다고 생각한 오버라이딩된 메서드가 없을수도 있다.
    // 이 경우, 기대와 다르게 부모 클래스에 있는 메서드가 호출되게 된다.

    // 위의 두가지 문제를 '추상클래스'를 사용하여 문제점을 해결할 수 있음 !

}
