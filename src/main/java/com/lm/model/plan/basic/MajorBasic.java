package com.lm.model.plan.basic;

import java.util.Date;

/**
 * Created by iii on 2019/2/18.
 */
public class MajorBasic {
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMajorName() {
        return majorName;
    }

    public String getMajorUrl() {
        return majorUrl;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getMajorIntroduction() {
        return majorIntroduction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setMajorUrl(String majorUrl) {
        this.majorUrl = majorUrl;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setMajorIntroduction(String majorIntroduction) {
        this.majorIntroduction = majorIntroduction;
    }

    private String id;
    private String title;
    private String majorName;
    private String majorUrl;
    private String majorCode;
    private Date createTime;
    private String majorIntroduction;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}
