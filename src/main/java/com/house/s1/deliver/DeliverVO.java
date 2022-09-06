package com.house.s1.deliver;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeliverVO {

    private Long deliver_num; //배송번호
    private Long order_num; //주문번호
    private String id; //아이디
    private String deliver_name; //배송받는사람
    private String deliver_adr; //배송주소
    private String deliver_dadr; //배송상세주소
    private String deliver_phone; //배송받는연락처
    private String deliver_contents; //배송 요청사항

    public Long getDeliver_num() {
        return deliver_num;
    }

    public void setDeliver_num(Long deliver_num) {
        this.deliver_num = deliver_num;
    }

    public Long getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Long order_num) {
        this.order_num = order_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeliver_name() {
        return deliver_name;
    }

    public void setDeliver_name(String deliver_name) {
        this.deliver_name = deliver_name;
    }

    public String getDeliver_adr() {
        return deliver_adr;
    }

    public void setDeliver_adr(String deliver_adr) {
        this.deliver_adr = deliver_adr;
    }

    public String getDeliver_dadr() {
        return deliver_dadr;
    }

    public void setDeliver_dadr(String deliver_dadr) {
        this.deliver_dadr = deliver_dadr;
    }

    public String getDeliver_phone() {
        return deliver_phone;
    }

    public void setDeliver_phone(String deliver_phone) {
        this.deliver_phone = deliver_phone;
    }

    public String getDeliver_contents() {
        return deliver_contents;
    }

    public void setDeliver_contents(String deliver_contents) {
        this.deliver_contents = deliver_contents;
    }
}
