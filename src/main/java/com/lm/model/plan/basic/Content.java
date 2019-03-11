package com.lm.model.plan.basic;

import java.util.Date;

/**
 * Created by iii on 2019/2/27.
 */
public class Content {

    private String trainingRequired;
    private String contentId;
    private String status;
    private Date createTime;
    private String id;

    public String getTrainingRequired() {
        return trainingRequired;
    }

    public void setTrainingRequired(String trainingRequired) {
        this.trainingRequired = trainingRequired;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
