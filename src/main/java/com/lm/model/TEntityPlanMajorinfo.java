package com.lm.model;

import java.util.Date;

public class TEntityPlanMajorinfo {
    private String id;

    private String planId;

    private TEntityTrainingplan trainingplan;

    private String introduction;

    private Integer limitYear;

    private String degree;

    private Integer minCredit;

    private String requirementDescription;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    public TEntityTrainingplan getTrainingplan() {
        return trainingplan;
    }

    public void setTrainingplan(TEntityTrainingplan trainingplan) {
        this.trainingplan = trainingplan;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getLimitYear() {
        return limitYear;
    }

    public void setLimitYear(Integer limitYear) {
        this.limitYear = limitYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Integer getMinCredit() {
        return minCredit;
    }

    public void setMinCredit(Integer minCredit) {
        this.minCredit = minCredit;
    }

    public String getRequirementDescription() {
        return requirementDescription;
    }

    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription == null ? null : requirementDescription.trim();
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