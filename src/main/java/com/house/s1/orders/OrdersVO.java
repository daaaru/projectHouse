package com.house.s1.orders;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrdersVO {

    private Long order_num; //주문번호
    private Long cart_num; //카트번호
    private Long product_num; //상품번호
    private Long store_num; // 가게번호
    private String ID; // 아이디
    private String order_name; //주문자명
    private String order_phone; //주문자번호
    private String order_address; //주문주소
    private String order_daddress; //주문상세주소
    private String order_contents; //주문요청사항
    private Integer total_count; //총수량
    private Integer total_price; //총가격
    private Integer order_type; //결제유형
    private Integer order_point; //포인트사용유무 0:사용x 1:사용함
    private Integer order_paypoint; //포인트사용수
    private Integer order_coupon; //쿠폰사용유무

    public Long getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Long order_num) {
        this.order_num = order_num;
    }

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
        return store_num;
    }

    public void setStore_num(Long store_num) {
        this.store_num = store_num;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getOrder_phone() {
        return order_phone;
    }

    public void setOrder_phone(String order_phone) {
        this.order_phone = order_phone;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public String getOrder_daddress() {
        return order_daddress;
    }

    public void setOrder_daddress(String order_daddress) {
        this.order_daddress = order_daddress;
    }

    public String getOrder_contents() {
        return order_contents;
    }

    public void setOrder_contents(String order_contents) {
        this.order_contents = order_contents;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Integer total_price) {
        this.total_price = total_price;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public Integer getOrder_point() {
        return order_point;
    }

    public void setOrder_point(Integer order_point) {
        this.order_point = order_point;
    }

    public Integer getOrder_paypoint() {
        return order_paypoint;
    }

    public void setOrder_paypoint(Integer order_paypoint) {
        this.order_paypoint = order_paypoint;
    }

    public Integer getOrder_coupon() {
        return order_coupon;
    }

    public void setOrder_coupon(Integer order_coupon) {
        this.order_coupon = order_coupon;
    }
}
