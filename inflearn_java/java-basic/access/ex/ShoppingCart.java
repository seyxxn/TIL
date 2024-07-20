package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public ShoppingCart(){
        itemCount = 0;
    }

    // 내부에서만 사용하면 되므로 private
    private boolean isMax(){
        return itemCount >= 10;
    }

    public void addItem(Item item){
        if (isMax()){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getPrice() * items[i].getQuantity());
            sum += items[i].getPrice() * items[i].getQuantity();
        }

        System.out.println("전체 가격 합:" + sum);
    }
}
