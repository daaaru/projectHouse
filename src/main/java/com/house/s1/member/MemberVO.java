package com.house.s1.member;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class MemberVO {
    private String id; //아이디
    private String password; //비번
    private String name; //이름
    private Integer gender; //성 0남자, 1여자
    private String nickname; //별명
    private String address; //주소
    private String detail_address; //상세주소
    private String phone; //휴대폰
    private String email; // 이메일
    private Integer role; //0:일반회원, 1:사장 2:관리자
    private Date member_cd; //회원 가입일자
    private Date member_ud; //회원정보 수정일자
    private Integer member_type; //가입구분 0:일반가입 1:간편가입

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getMember_cd() {
        return member_cd;
    }

    public void setMember_cd(Date member_cd) {
        this.member_cd = member_cd;
    }

    public Date getMember_ud() {
        return member_ud;
    }

    public void setMember_ud(Date member_ud) {
        this.member_ud = member_ud;
    }

    public Integer getMember_type() {
        return member_type;
    }

    public void setMember_type(Integer member_type) {
        this.member_type = member_type;
    }
}
