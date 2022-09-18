package com.house.s1.store_notice;

import com.house.s1.util.FileVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Store_noticeFileVO extends FileVO {

    private Long snotce_num; // 가게공지글번호
    private Long store_num; //가게번호

}
