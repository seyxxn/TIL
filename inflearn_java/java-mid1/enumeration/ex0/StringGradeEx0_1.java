package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic); // 1000원
        System.out.println("GOLD 등급의 할인 금액: " + gold); // 2000원
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond); // 3000원
    }
}
