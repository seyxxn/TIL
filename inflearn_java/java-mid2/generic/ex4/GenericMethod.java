package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("object print: " + obj);
        return obj;
    }

    // 메서드 하나에도 제네릭을 사용할 수 있음 (제네릭 메서드)
    // 제네릭 타입과는 다른 기능임
    public static <T> T genericMethod(T t){
        System.out.println("generic print: " + t);
        return t;
    }

    // 제네릭 메서드에서도 매개변수 제한이 가능함
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }
}
