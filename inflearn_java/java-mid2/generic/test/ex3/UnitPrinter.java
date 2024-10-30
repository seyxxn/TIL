package generic.test.ex3;

import generic.animal.Animal;
import generic.ex5.Box;

public class UnitPrinter {
    // 제네릭 메서드로 구현
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        System.out.println("이름: " + t.out().getName() + ", HP: " + t.out().getHp());
    }

    // 와일드 카드로 구현
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        System.out.println("이름: " + shuttle.out().getName() + ", HP: " + shuttle.out().getHp());
    }
}
