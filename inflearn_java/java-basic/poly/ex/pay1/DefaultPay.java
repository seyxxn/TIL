package poly.ex.pay1;

public class DefaultPay implements Pay{
    // 결제 수단을 찾지 못했을 때 사용
    // 이 클래스를 사용하면 null 체크를 피할 수 있음

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
