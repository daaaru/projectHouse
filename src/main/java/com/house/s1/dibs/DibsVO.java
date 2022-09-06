package com.house.s1.dibs;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DibsVO {

    private Long dibs_num; //찜번호
    private Long product_num; //상품번호
    private Long store_num; //가게번호
    private String id; //아이디
    private Long category_num; //카테고리번호

    public Long getDibs_num() {
        return dibs_num;
    }

    public void setDibs_num(Long dibs_num) {
        this.dibs_num = dibs_num;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCategory_num() {
        return category_num;
    }

    public void setCategory_num(Long category_num) {
        this.category_num = category_num;
    }
}
