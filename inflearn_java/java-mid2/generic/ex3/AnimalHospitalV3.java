package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // 타입 매개변수 제한
    // <T extends Animal>을 통해 Animal과 그 자식들만 들어올 수 있게 함
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // 위에서 매개변수 제한을 걸어줬기 때문에 메서드 호출이 가능하게 됨
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
         return animal.getSize() > target.getSize() ? animal : target;
    }
}
