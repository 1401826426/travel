package com.fei.travel.item.pojo;

import java.math.BigDecimal;

public class Comment {
    private Long id;

    private Long userId;

    private String userName;

    private Integer lv;

    private Integer vipLv;

    private BigDecimal viewStar;

    private BigDecimal funStar;

    private BigDecimal valueForMoneyStar;

    private String content;

    private String pics;

    private Integer beLikedNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getVipLv() {
        return vipLv;
    }

    public void setVipLv(Integer vipLv) {
        this.vipLv = vipLv;
    }

    public BigDecimal getViewStar() {
        return viewStar;
    }

    public void setViewStar(BigDecimal viewStar) {
        this.viewStar = viewStar;
    }

    public BigDecimal getFunStar() {
        return funStar;
    }

    public void setFunStar(BigDecimal funStar) {
        this.funStar = funStar;
    }

    public BigDecimal getValueForMoneyStar() {
        return valueForMoneyStar;
    }

    public void setValueForMoneyStar(BigDecimal valueForMoneyStar) {
        this.valueForMoneyStar = valueForMoneyStar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public Integer getBeLikedNum() {
        return beLikedNum;
    }

    public void setBeLikedNum(Integer beLikedNum) {
        this.beLikedNum = beLikedNum;
    }
}