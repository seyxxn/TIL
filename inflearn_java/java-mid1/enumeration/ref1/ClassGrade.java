package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent; // 아예 할인율을 가지게 함

    private ClassGrade(int discountPercent){
        this.discountPercent = discountPercent; // 생성자를 생성해서 할인율을 넣음
    }

    public int getDiscountPercent(){
        return discountPercent;
    }

    // 상수를 정의하는 시점에 이미 할인율이 정해지게 됨

}
