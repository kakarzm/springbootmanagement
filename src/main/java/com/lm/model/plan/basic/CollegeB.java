package com.lm.model.plan.basic;

import java.util.Date;

/**
 * Created by iii on 2019/2/12.
 */
public class CollegeB {

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCollegeType() {
        return collegeType;
    }

    public String getAddress() {
        return Address;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCollegeType(String collegeType) {
        this.collegeType = collegeType;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String id;
    private String title;
    private String collegeType;
    private String Address;
    private String status;
    private Date createTime;
}

