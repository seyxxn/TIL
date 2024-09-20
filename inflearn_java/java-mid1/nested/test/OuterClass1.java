package nested.test;

public class OuterClass1 {
    // 여기에 NestedClass 구현. 그리고 hello() 메서드를 만들기
    static class NestedClass {
        public void hello(){
            System.out.println("NestedClass.hello");
        }
    }
}
