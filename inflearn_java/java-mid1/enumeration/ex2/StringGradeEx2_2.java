package enumeration.ex2;

public class StringGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//        ClassGrade classGrade = new ClassGrade(); // 새로만든 ClassGrade
//        int result = discountService.discount(classGrade, price);
//        System.out.println("newClassGrade 등급의 할인 금액 = " + result);

        // 이렇게 외부에서 ClassGrade를 생성할 수 없도록 막아야 함
        // 기본 생성자를 private로 변경하자
    }
}
