package com.house.s1.mycoupon;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MyCouponVO {

    private Long mycoupon_num; //쿠폰소유번호
    private String id; // 아이디
    private Long coupon_num2; // 쿠폰번호
    private String mycoupon_name; //쿠폰명
    private String mycoupon_code; //쿠폰코드
    private Integer mycoupon_create; //쿠폰 발급유무 0:발급안함 1:발급함
    private Integer mycoupon_use; //쿠폰 사용유무 0:사용안함 1:사용함

    public Long getMycoupon_num() {
        return mycoupon_num;
    }

    public void setMycoupon_num(Long mycoupon_num) {
        this.mycoupon_num = mycoupon_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCoupon_num2() {
        return coupon_num2;
    }

    public void setCoupon_num2(Long coupon_num2) {
        this.coupon_num2 = coupon_num2;
    }

    public String getMycoupon_name() {
        return mycoupon_name;
    }

    public void setMycoupon_name(String mycoupon_name) {
        this.mycoupon_name = mycoupon_name;
    }

    public String getMycoupon_code() {
        return mycoupon_code;
    }

    public void setMycoupon_code(String mycoupon_code) {
        this.mycoupon_code = mycoupon_code;
    }

    public Integer getMycoupon_create() {
        return mycoupon_create;
    }

    public void setMycoupon_create(Integer mycoupon_create) {
        this.mycoupon_create = mycoupon_create;
    }

    public Integer getMycoupon_use() {
        return mycoupon_use;
    }

    public void setMycoupon_use(Integer mycoupon_use) {
        this.mycoupon_use = mycoupon_use;
    }
}
