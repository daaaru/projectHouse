package com.house.s1.category;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryVO {

    private Long category_num; //카테고리 번호
    private String category_name; //카테고리명

    public Long getCategory_num() {
        return category_num;
    }

    public void setCategory_num(Long category_num) {
        this.category_num = category_num;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
