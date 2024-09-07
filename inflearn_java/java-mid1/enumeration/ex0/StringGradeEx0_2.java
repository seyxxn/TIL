package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 = " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONODD 등급의 할인 금액 = " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + gold);

        // 이렇게 String을 사용하는 방식에는 문제가 있음
        // -> 타입 안정성 부족 : 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있음
        // -> 데이터 일관성 : 다양한 형식으로 문자열을 입력할 수 있어서 일관성이 떨어짐


        // 즉, 특정 범위로 값을 제한해야 함.
        // String은 어떤 문자열이든 받을 수 있기에 String 타입을 사용해서는 문제를 해결할 수 없음 -> ENUM 사용 필요
    }
}
