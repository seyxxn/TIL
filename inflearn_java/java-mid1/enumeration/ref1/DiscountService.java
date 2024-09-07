package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent() / 100;

        // if 문을 사용하지 않아도 됨!
    }
}
