package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // 무조건 바깥 인스턴스의 생성이 먼저 필요함! (정적 중첩 클래스와의 차이점)
        InnerOuter.Inner inner = outer.new Inner(); // 생성 방법 특이함 ** 주의
        // 인스턴스를 알아야하기 때문에 바깥클래스.new 내부 클래스()로 생성해야함

        // 내부 클래스는 바깥 클래스의 인스턴스에 소속이 되어야 함
        // 따라서 내부 클래스를 생성할때는 바깥 클래스가 필요함
        
        inner.print();

        System.out.println("innerClasee = " + inner.getClass());
    }
}
