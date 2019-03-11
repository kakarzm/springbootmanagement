package com.lm.model.plan.basic;

import java.util.Date;

/**
 * Created by iii on 2019/2/25.
 */
public class Training {

    private String id;
    private String title;
    private String majorType;
    private String college;
    private String information;
    private String majorCode;
    private String status;
    private Date createTime;
    private String[] trainingRequires;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMajorType() {
        return majorType;
    }

    public String getCollege() {
        return college;
    }

    public String getInformation() {
        return information;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String[] getTrainingRequires() {
        return trainingRequires;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMajorType(String majorType) {
        this.majorType = majorType;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setTrainingRequires(String[] trainingRequires) {
        this.trainingRequires = trainingRequires;
    }


}
