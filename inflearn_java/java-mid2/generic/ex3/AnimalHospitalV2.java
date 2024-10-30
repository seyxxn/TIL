package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        animal.toString();
        animal.equals(null);

        // 에러가 나는 이유 : T의 타입을 메서드를 정의하는 시점에는 알 수 없기 때문. Object의 기능만 사용
//        System.out.println("동물 이름: " + animal.getName()); // 그래서 getName, getSize 호출이 불가능함
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();

        // 따라서 뭐가 들어올지 모르니까 Object의 기능만 사용이 가능하다
    }

    public T bigger(T target) {
        // 컴파일 오류
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
