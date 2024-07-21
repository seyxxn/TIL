package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 동물이 추가되어도 변하지 않는 코드 !!
    private static void soundAnimal(Animal animal) {
        // 부모는 자식을 담을 수 있기에 Animal로 모든 자식 클래스를 받을 수 있음
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 각각 오버라이딩된 메서드가 출력됨
        System.out.println("동물 소리 테스트 종료");
    }
}
