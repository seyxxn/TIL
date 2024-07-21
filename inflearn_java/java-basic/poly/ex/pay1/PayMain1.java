package poly.ex.pay1;
import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String payOption;
        int amount;

        while(true){
            System.out.print("결제 수단을 입력하세요:");
            payOption = sc.nextLine();

            if (payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요:");
            amount = sc.nextInt();
            sc.nextLine();

            PayService payService = new PayService();
            payService.processPay(payOption, amount);

        }

    }
}