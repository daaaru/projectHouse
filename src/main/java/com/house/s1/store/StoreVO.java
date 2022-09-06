package com.house.s1.store;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class StoreVO {

    private Long store_num; // 가게번호
    private String id; //아이디
    private String store_oname; // 대표자이름
    private String store_name; //회사명
    private Integer store_number; //사업자번호
    private String store_brand; //브랜드명

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

    public String getStore_oname() {
        return store_oname;
    }

    public void setStore_oname(String store_oname) {
        this.store_oname = store_oname;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public Integer getStore_number() {
        return store_number;
    }

    public void setStore_number(Integer store_number) {
        this.store_number = store_number;
    }

    public String getStore_brand() {
        return store_brand;
    }

    public void setStore_brand(String store_brand) {
        this.store_brand = store_brand;
    }
}
