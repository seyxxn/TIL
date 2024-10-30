package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 100);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이를 전달
//        dogHospital.set(cat); -> 컴파일 오류 발생함 (다른 타입을 입력하면 오류 발생)

        // 문제2: 개 타입을 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

// 개 병원은 개만 받고, 고양이 병원은 고양이만 받고 있음
// 각 클래스 별로 타입이 명확하기 때문에 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있음
// 따라서 개 병원에 고양이를 전달하면 컴파일 오류 발생함

// 코드 재사용 X : 개 병원과 고양이 병원은 중복이 많음
// 타입 안전성 O : 타입 안전성이 명확하게 지켜지고 있음