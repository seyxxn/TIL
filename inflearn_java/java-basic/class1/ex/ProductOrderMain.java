package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        ProductOrder kimchi = new ProductOrder();
        ProductOrder coke = new ProductOrder();

        ProductOrder[] productOrders = new ProductOrder[]{dubu, kimchi, coke};

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        coke.productName = "콜리";
        coke.price = 1500;
        coke.quantity = 2;

        int total = 0;
        for(ProductOrder po : productOrders){
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
            total += po.price * po.quantity;
        }

        System.out.println("총 결제 금액: " + total);
    }
}
