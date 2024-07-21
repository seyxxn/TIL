package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 생략이 가능하다. 생략하는 것이 더 자연스럽기에 생략을 권장
        Parent parent2 = child; // 업 캐스팅 생략한 경우

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
