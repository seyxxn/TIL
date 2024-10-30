package generic.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal){
        this.animal = animal;
    }

    // 개의 이름과 크기를 호출, sound 호출
    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    // 다른 개와 크기를 비교
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
        // 둘 중에 사이즈가 더 큰 개를 반환해주는 함수
    }

}
