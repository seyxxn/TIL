package lang.object;

// 명시적으로 extends를 사용했기 때문에, Object를 상속받지 않음
public class Child extends Parent{

    public  void childMethod(){
        System.out.println("Child.childMethod");
    }

}
