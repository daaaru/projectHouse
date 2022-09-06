package com.house.s1.review;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ReviewVO {

    private Long review_num; //리뷰번호
    private Long product_num; //상품번호
    private Long Store_num; //가게번호
    private String id; //아이디
    private String review_contents; //리뷰내용
    private Date review_cd; //리뷰 작성일자
    private Date review_ud; //리뷰수정일자
    private Integer review_star; //별점

    public Long getReview_num() {
        return review_num;
    }

    public void setReview_num(Long review_num) {
        this.review_num = review_num;
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

    public String getReview_contents() {
        return review_contents;
    }

    public void setReview_contents(String review_contents) {
        this.review_contents = review_contents;
    }

    public Date getReview_cd() {
        return review_cd;
    }

    public void setReview_cd(Date review_cd) {
        this.review_cd = review_cd;
    }

    public Date getReview_ud() {
        return review_ud;
    }

    public void setReview_ud(Date review_ud) {
        this.review_ud = review_ud;
    }

    public Integer getReview_star() {
        return review_star;
    }

    public void setReview_star(Integer review_star) {
        this.review_star = review_star;
    }
}
