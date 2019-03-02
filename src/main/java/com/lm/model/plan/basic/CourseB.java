package com.lm.model.plan.basic;

import java.util.Date;

/**
 * Created by iii on 2019/2/18.
 */
public class CourseB {
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCourseType() {
        return courseType;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    private String id;
    private String title;
    private String courseType;
    private String englishName;
    private String status;
    private Date createTime;
    private String courseCode;
}
