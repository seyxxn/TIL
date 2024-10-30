package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
    // 동물 병원에 Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달할 수 있다는 문제점이 있음
    // 우리는 최소한 Animal이나 그 자식 타입 인자로 제한하고 싶음!

    // 만약 타입 인자가 모두 Animal 과 그 자식만 들어올 수 있게 제한한다면 어떨까 ?? -> '타입 매개변수 제한'
}

