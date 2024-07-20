package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형을 final로 선언

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 참조 대상의 객체 값은 변경이 가능하다.
        // 데이터 자신을 바꾸는 것이 불가능 한 것이다. (참조값을 바꾸는 것이 불가능)
        // 다른 객체를 참조하지 못한다는 것이다.

    }
}
