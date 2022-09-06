package com.house.s1.board;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class BoardVO {

    private Long num; //번호

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    private String id; //아이디
    private String title; //제목
    private String contents; //내용
    private Date board_cd; //작성날짜
    private Date board_ud; //업데이트 날짜
    private Long hit; //조회수

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getBoard_cd() {
        return board_cd;
    }

    public void setBoard_cd(Date board_cd) {
        this.board_cd = board_cd;
    }

    public Date getBoard_ud() {
        return board_ud;
    }

    public void setBoard_ud(Date board_ud) {
        this.board_ud = board_ud;
    }

    public Long getHit() {
        return hit;
    }

    public void setHit(Long hit) {
        this.hit = hit;
    }
}
