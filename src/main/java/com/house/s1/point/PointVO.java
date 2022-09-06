package com.house.s1.point;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class PointVO {

    private Long point_num; //포인트번호
    private Long order_num; //주문번호
    private Long product_num; //상품번호
    private String id; //아이디
    private String point_contents; //포인트내용
    private Date point_adddate; //적립날짜
    private Date point_deadline; //기한일
    private Integer point_count; //포인트적립
    private Integer point_use; //사용포인트

    public Long getPoint_num() {
        return point_num;
    }

    public void setPoint_num(Long point_num) {
        this.point_num = point_num;
    }

    public Long getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Long order_num) {
        this.order_num = order_num;
    }

    public Long getProduct_num() {
        return product_num;
    }

    public void setProduct_num(Long product_num) {
        this.product_num = product_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoint_contents() {
        return point_contents;
    }

    public void setPoint_contents(String point_contents) {
        this.point_contents = point_contents;
    }

    public Date getPoint_adddate() {
        return point_adddate;
    }

    public void setPoint_adddate(Date point_adddate) {
        this.point_adddate = point_adddate;
    }

    public Date getPoint_deadline() {
        return point_deadline;
    }

    public void setPoint_deadline(Date point_deadline) {
        this.point_deadline = point_deadline;
    }

    public Integer getPoint_count() {
        return point_count;
    }

    public void setPoint_count(Integer point_count) {
        this.point_count = point_count;
    }

    public Integer getPoint_use() {
        return point_use;
    }

    public void setPoint_use(Integer point_use) {
        this.point_use = point_use;
    }
}
