package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 둘이 같은 코드
        Animal[] animalArr = {dog, cat, cow};
        // Animal[] animalArr = new Animal[]{dog, cat, cow};

        // 변하지 않는 부분
        // 배열과 for문을 이용하여 중복을 제거하는 방법
        for(Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
