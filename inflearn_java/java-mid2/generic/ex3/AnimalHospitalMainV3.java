package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<Integer>();
        // -> 컴파일 오류 발생함 !

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이를 전달
        // dogHospital.set(cat); 컴파일 오류 발생 -> 다른 타입을 입력했기 때문에

        // 문제2: 개 타입을 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); // 다운 캐스팅 안해도 됨! (Dog으로 반환되기 때문에)
        System.out.println("biggerDog = " + biggerDog);
    }
}

// 타입 안전성 문제 해결 !!
// 제네릭에 타입 매개변수 상한을 사용해서 타입 안전성을 지키면서 상위 타입의 원하는 기능까지 사용할 수 있었음
// 덕분에 코드 재사용과 타입 안전성 두 문제를 모두 해결할 수 있게 됨
