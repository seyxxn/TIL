package static2;

// import static static2.DecoData.*;
// static import

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
//        staticCall();
//        staticCall();
//        staticCall();
//        staticCall();
//        staticCall();
        // option + enter -> static import 가능
        // 클래스 명을 안적어도 생략이 가능하다

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        // instanceValue는 새로 만들어지기 때문에 1로 출력되지만
        // staticValue는 계속 증가함 (공유하기 때문)

        // 객체의 참조값을 직접 매개변수를 전달하면
        // 정적 메서드도 인스턴스의 변수나 메서드를 호출할 수 있음
        DecoData.staticCall(data1);
        // 1-> 2로 증가함

        System.out.println("---------------");

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();
        // -> 이 방법은 별로 좋지 않음 (명시적으로 좋지 않음)

        // 클래스를 통한 접근
        DecoData.staticCall();

        // 정적 메서드를 호출할때 이 두가지 방법 모두 가능하다

    }
}
