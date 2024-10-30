package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 100);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이를 전달
        dogHospital.set(cat);
        // 이게 가능하다 -> 가능하면 안됨 !!
        // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음

        // 문제2: 개 타입을 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        // Animal로 반환이 되기 때문에 Dog로 다운캐스팅을 해야함
        System.out.println("biggerDog = " + biggerDog);
    }
}

// 코드 재사용 O : 다형성을 통해 AnimalHospitalV1 하나로 개와 고양이를 모두 처리함
// 타입 안전성 X : 개 병원에 고양이를 전달하는 문제가 발생함, Animal 타입을 반환하기 때문에 다운 캐스팅 필요, 실수로 고양이를 입력했는데 개를 반환하는 상황이라면 캐스팅 예외가 발생함
