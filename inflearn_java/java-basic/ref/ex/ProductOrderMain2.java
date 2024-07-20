package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        ProductOrder dubu = createOrder("두부", 2000, 2);
        ProductOrder kimchi = createOrder("김치", 5000, 1);
        ProductOrder coke = createOrder("콜라", 1500, 2);

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[]{dubu, kimchi, coke};

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
