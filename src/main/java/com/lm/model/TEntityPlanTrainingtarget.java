package com.lm.model;

import com.lm.vo.ValueBean;

import java.util.Date;
import java.util.List;

public class TEntityPlanTrainingtarget {
    private String id;

    private String planId;

    private TEntityTrainingplan trainingplan;

    private String target;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    private List<TEntityPlanTrainingtargetRequire> targetRequires;

    public List<TEntityPlanTrainingtargetRequire> getTargetRequires() {
        return targetRequires;
    }

    public void setTargetRequires(List<TEntityPlanTrainingtargetRequire> targetRequires) {
        this.targetRequires = targetRequires;
    }

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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
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