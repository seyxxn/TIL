package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    // 고양이의 이름과 크기를 호출, sound 호출
    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    // 다른 고양이와 크기를 비교
    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
        // 둘 중에 사이즈가 더 큰 고양이를 반환해주는 함수
    }

}
