package com.house.s1.product;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductVO {

    private Long product_num; //상품번호
    private Long store_num; //가게번호
    private String Id; //아이디
    private Long category_num; // 카테고리번호
    private String product_name; //상품명
    private Integer price; //가격
    private Integer discount_rate; //할인율
    private String product_contents; //상품내용
    private Integer product_hit; //조회수
    private Integer stock; //재고수량
    private Integer sales; //판매수량
    private Date product_date; //상품등록날짜

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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Long getCategory_num() {
        return category_num;
    }

    public void setCategory_num(Long category_num) {
        this.category_num = category_num;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(Integer discount_rate) {
        this.discount_rate = discount_rate;
    }

    public String getProduct_contents() {
        return product_contents;
    }

    public void setProduct_contents(String product_contents) {
        this.product_contents = product_contents;
    }

    public Integer getProduct_hit() {
        return product_hit;
    }

    public void setProduct_hit(Integer product_hit) {
        this.product_hit = product_hit;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Date getProduct_date() {
        return product_date;
    }

    public void setProduct_date(Date product_date) {
        this.product_date = product_date;
    }
}
