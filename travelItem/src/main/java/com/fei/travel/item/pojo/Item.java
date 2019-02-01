package com.fei.travel.item.pojo;

import java.math.BigDecimal;

public class Item {
    private Integer id;

    private Integer type;

    private String name;

    private String defaultPic;

    private Integer stPrice;

    private Integer cityId;

    private String tips;

    private Integer times;

    private BigDecimal star;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDefaultPic() {
        return defaultPic;
    }

    public void setDefaultPic(String defaultPic) {
        this.defaultPic = defaultPic == null ? null : defaultPic.trim();
    }

    public Integer getStPrice() {
        return stPrice;
    }

    public void setStPrice(Integer stPrice) {
        this.stPrice = stPrice;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public BigDecimal getStar() {
        return star;
    }

    public void setStar(BigDecimal star) {
        this.star = star;
    }
}