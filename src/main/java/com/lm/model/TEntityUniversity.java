package com.lm.model;

import java.util.Date;

public class TEntityUniversity {
    private String id;

    private String name;

    private Integer provinceId;

    private TDmDistrict province;

    private Integer cityId;

    private TDmDistrict city;

    private String type;

    private String jubanType;

    private String yuanxiaoType;

    private String attribute;

    private String banxueType;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    public TDmDistrict getProvince() {
        return province;
    }

    public void setProvince(TDmDistrict province) {
        this.province = province;
    }

    public TDmDistrict getCity() {
        return city;
    }

    public void setCity(TDmDistrict city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getJubanType() {
        return jubanType;
    }

    public void setJubanType(String jubanType) {
        this.jubanType = jubanType == null ? null : jubanType.trim();
    }

    public String getYuanxiaoType() {
        return yuanxiaoType;
    }

    public void setYuanxiaoType(String yuanxiaoType) {
        this.yuanxiaoType = yuanxiaoType == null ? null : yuanxiaoType.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getBanxueType() {
        return banxueType;
    }

    public void setBanxueType(String banxueType) {
        this.banxueType = banxueType == null ? null : banxueType.trim();
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue == null ? null : statue.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getEditby() {
        return editby;
    }

    public void setEditby(String editby) {
        this.editby = editby == null ? null : editby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}