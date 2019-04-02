package com.lm.model;

import java.util.Date;
import java.util.List;

public class TEntityTrainingplan {
    private String id;

    private String name;

    private String englishName;

    private String majorId;

    private TEntityMajor major;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    private List<TEntityCourse> courses; //关联主干课程

    private List<TEntitySemester> semesters; //关联学期

    private List<TEntityCoursetypeInfo> coursetypeInfos; //关联课程体系

    public List<TEntityCoursetypeInfo> getCoursetypeInfos() {
        return coursetypeInfos;
    }

    public void setCoursetypeInfos(List<TEntityCoursetypeInfo> coursetypeInfos) {
        this.coursetypeInfos = coursetypeInfos;
    }

    public List<TEntitySemester> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<TEntitySemester> semesters) {
        this.semesters = semesters;
    }

    public List<TEntityCourse> getCourses() {
        return courses;
    }

    public void setCourses(List<TEntityCourse> courses) {
        this.courses = courses;
    }

    public TEntityMajor getMajor() {
        return major;
    }

    public void setMajor(TEntityMajor major) {
        this.major = major;
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

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
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