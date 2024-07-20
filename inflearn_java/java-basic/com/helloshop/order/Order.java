package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user; // 어떤 사용자가 주문했는지 .. 사용자에 대한 정보를 가져오기 위해
    Product product; // 어떤 제품을 주문했는가

    // 생성자
    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
