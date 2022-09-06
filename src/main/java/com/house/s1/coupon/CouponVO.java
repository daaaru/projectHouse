package com.house.s1.coupon;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class CouponVO {

    private Long coupon_num; // 쿠폰번호
    private String coupon_name; //쿠폰명
    private String coupon_contents; //쿠폰내용
    private Integer coupon_rate; //할인율
    private Date coupon_deadline; //쿠폰기한일
    private String coupon_code; //쿠폰코드
    private String id; // 아이디

    public Long getCoupon_num() {
        return coupon_num;
    }

    public void setCoupon_num(Long coupon_num) {
        this.coupon_num = coupon_num;
    }

    public String getCoupon_name() {
        return coupon_name;
    }

    public void setCoupon_name(String coupon_name) {
        this.coupon_name = coupon_name;
    }

    public String getCoupon_contents() {
        return coupon_contents;
    }

    public void setCoupon_contents(String coupon_contents) {
        this.coupon_contents = coupon_contents;
    }

    public Integer getCoupon_rate() {
        return coupon_rate;
    }

    public void setCoupon_rate(Integer coupon_rate) {
        this.coupon_rate = coupon_rate;
    }

    public Date getCoupon_deadline() {
        return coupon_deadline;
    }

    public void setCoupon_deadline(Date coupon_deadline) {
        this.coupon_deadline = coupon_deadline;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
