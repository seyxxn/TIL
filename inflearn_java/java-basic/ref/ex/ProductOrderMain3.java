package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for(int i = 0; i < n; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            String productName;
            int price;
            int quantity;
            ProductOrder productOrder;

            System.out.print("상품명: ");
            productName = scanner.nextLine();
            System.out.print("가격: ");
            price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            productOrder = createOrder(productName, price, quantity);
            productOrders[i] = productOrder;
        }

        // printOrder()를 사용해서 상품 주문 정보 출력
        printOrders(productOrders);

        // getTotalAmout()를 사용해서 총 결제 금액 계산
        int total = getTotalAmout(productOrders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + total);
    }


    static ProductOrder createOrder(String productName, int price, int quantity)
    {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static int getTotalAmout(ProductOrder[] orders)
    {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }

    static void printOrders(ProductOrder[] orders)
    {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
}
