package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // 정적 메서드
    public static void staticCall(){
        // instanveValue++; // 인스턴스 변수 접근, compile error
        // instanceMethod(); // 인스턴스 메서드 접근, compile error
        // 정적 메서드이기 때문에 인스턴스 변수나 인스턴스 메서드에는 접근이 불가능하다

        staticValue++; // 정적 변수에 접근
        // 정적 메서드이기 때문에 정적 변수에 접근이 가능하다

        staticMethod(); // 정적 메서드 접근 가능
        // 정적 메서드에서 정적 메서드 호출이 가능
    }
    // static에서는 static만 접근할 수 있다.

    // 인스턴스 메서드
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }
    // 나머지에서는 모든 것에 다 접근할 수 있다.

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }


    private void instanceMethod(){
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue= " + staticValue);
    }
}
