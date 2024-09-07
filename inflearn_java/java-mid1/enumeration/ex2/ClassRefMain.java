package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());
        // 같은 ClassGrade 타입이지만
        // 인스턴스는 다름

        // 3개 모두 참조 값이 다름 (인스턴스를 각각 따로 가지고 있음)
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("reg DIAMOND = " + ClassGrade.DIAMOND);
    }
}
