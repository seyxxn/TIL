package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    public void order() {
        // 실제 주문하는 비즈니스 로직
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
