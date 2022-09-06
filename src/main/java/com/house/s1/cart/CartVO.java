package com.house.s1.cart;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CartVO {

    private Long cart_num; //카트번호
    private Long product_num; //상품번호
    private Long Store_num; //가게번호
    private String id; //아이디
    private Integer cart_count; //수량

    public Long getCart_num() {
        return cart_num;
    }

    public void setCart_num(Long cart_num) {
        this.cart_num = cart_num;
    }

    public Long getProduct_num() {
        return product_num;
    }

    public void setProduct_num(Long product_num) {
        this.product_num = product_num;
    }

    public Long getStore_num() {
        return Store_num;
    }

    public void setStore_num(Long store_num) {
        Store_num = store_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCart_count() {
        return cart_count;
    }

    public void setCart_count(Integer cart_count) {
        this.cart_count = cart_count;
    }
}
