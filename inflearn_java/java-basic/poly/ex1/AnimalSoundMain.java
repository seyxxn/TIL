package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 배열과 for문을 통한 중복 제거 시도
        // Cow[]  cowArr = {cat, dog, cow}; -> 컴파일 오류 발생
//        System.out.println("동물 소리 테스트 시작");
//        for(Cow cow : cowArr) {
//            cowArr.sound();
//        }
//        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

        // 코드의 중복을 해결할 방법은 없을까 ?
        // 중복을 제거하기 위해서는 메서드를 사용하거나,
        // 또는 배열과 for문을 사용하면되는데 ..
        // 문제는 세 동물이 다 완전히 다른 클래스인것이다 -> 이게 핵심적인 문제 !
    }

    // 메서드로 중복 제거 시도
    public static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    // 이 메서드는 Cow 전용이기에, 다른 클래스들은 인수로 사용할 수 없다는 문제점 존재

}
