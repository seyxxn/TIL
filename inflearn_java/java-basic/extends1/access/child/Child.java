package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지
        // 다른 패키지지만 상속관계라서 접근 가능
        // defaultValue = 1; // 다른 패키지에서는 접근불가능, 컴파일 오류
        // privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 패키지
        // 다른 패키지지만 상속관계라서 접근 가능
        // defaultMethod(); // 다른 패키지에서 접근 불가능, 컴파일 오류
        // privateMethod(); // 접근 불가, 컴파일 오류

        printParent();

    }
}
