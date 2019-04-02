package com.lm.model;

import java.util.Date;
import java.util.List;

public class TEntityCoursetypeInfo {
    private String id;

    private String planId;

    private String courseTypeId;

    private TEntityCourseType courseType;

    private Integer allCredit;

    private Integer theory;

    private Integer practice;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    private List<TEntityCoursetypeSemester> coursetypeSemesters; //关联课程体系学时学分学期分配

    public TEntityCourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(TEntityCourseType courseType) {
        this.courseType = courseType;
    }

    public List<TEntityCoursetypeSemester> getCoursetypeSemesters() {
        return coursetypeSemesters;
    }

    public void setCoursetypeSemesters(List<TEntityCoursetypeSemester> coursetypeSemesters) {
        this.coursetypeSemesters = coursetypeSemesters;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId == null ? null : courseTypeId.trim();
    }

    public Integer getAllCredit() {
        return allCredit;
    }

    public void setAllCredit(Integer allCredit) {
        this.allCredit = allCredit;
    }

    public Integer getTheory() {
        return theory;
    }

    public void setTheory(Integer theory) {
        this.theory = theory;
    }

    public Integer getPractice() {
        return practice;
    }

    public void setPractice(Integer practice) {
        this.practice = practice;
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