package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printGenericV2(dogBox);


        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("나옹이", 200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        // 위의 두 예시(printAndReturnGeneric)에서는 제네릭을 사용했기 때문에 둘다 문제가 없음
        // -> 즉, 각각 Dog, Cat으로 잘 반환이 됨

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        // 하지만 이 메서드(wildcard를 활용한)를 사용하면 상한을 Animal로 두었기에 Animal로 반한됨 !
        // -> 즉, 뭐가 들어와도 Animal로 밖에 반환이 되지 않음
        // -> 어쩔수없이 캐스팅을 해야함
    }
}

// 와일드카드 : 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아님 !
// 이미 만들어진 제네릭 타입을 활용할 때 사용함 (제네릭을 편리하게 사용하기 위해)