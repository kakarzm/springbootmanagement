package com.lm.model.plan.basic;

import java.util.Date;
import java.util.List;

public class TbEntityCompanyNeed {
    private Integer companyNeedId;

    private String companyNeedJobName;

    private String companyNeedDescription;

    private Integer companyNeedType;

    private String companyNeedProfession;

    private String companyNeedName;

    private String companyNeedIntroduction;

    private String companyNeedRequirement;

    private Date companyNeedCreated;

    private Date companyNeedUpdated;

    private Integer companyNeedStatus;

    private String companyNeedBackup1;

    private String companyNeedBackup2;

    public Integer getCompanyNeedId() {
        return companyNeedId;
    }

    public void setCompanyNeedId(Integer companyNeedId) {
        this.companyNeedId = companyNeedId;
    }

    public String getCompanyNeedJobName() {
        return companyNeedJobName;
    }

    public void setCompanyNeedJobName(String companyNeedJobName) {
        this.companyNeedJobName = companyNeedJobName == null ? null : companyNeedJobName.trim();
    }

    public String getCompanyNeedDescription() {
        return companyNeedDescription;
    }

    public void setCompanyNeedDescription(String companyNeedDescription) {
        this.companyNeedDescription = companyNeedDescription == null ? null : companyNeedDescription.trim();
    }

    public Integer getCompanyNeedType() {
        return companyNeedType;
    }

    public void setCompanyNeedType(Integer companyNeedType) {
        this.companyNeedType = companyNeedType;
    }

    public String getCompanyNeedProfession() {
        return companyNeedProfession;
    }

    public void setCompanyNeedProfession(String companyNeedProfession) {
        this.companyNeedProfession = companyNeedProfession == null ? null : companyNeedProfession.trim();
    }

    public String getCompanyNeedName() {
        return companyNeedName;
    }

    public void setCompanyNeedName(String companyNeedName) {
        this.companyNeedName = companyNeedName == null ? null : companyNeedName.trim();
    }

    public String getCompanyNeedIntroduction() {
        return companyNeedIntroduction;
    }

    public void setCompanyNeedIntroduction(String companyNeedIntroduction) {
        this.companyNeedIntroduction = companyNeedIntroduction == null ? null : companyNeedIntroduction.trim();
    }

    public String getCompanyNeedRequirement() {
        return companyNeedRequirement;
    }

    public void setCompanyNeedRequirement(String companyNeedRequirement) {
        this.companyNeedRequirement = companyNeedRequirement == null ? null : companyNeedRequirement.trim();
    }

    public Date getCompanyNeedCreated() {
        return companyNeedCreated;
    }

    public void setCompanyNeedCreated(Date companyNeedCreated) {
        this.companyNeedCreated = companyNeedCreated;
    }

    public Date getCompanyNeedUpdated() {
        return companyNeedUpdated;
    }

    public void setCompanyNeedUpdated(Date companyNeedUpdated) {
        this.companyNeedUpdated = companyNeedUpdated;
    }

    public Integer getCompanyNeedStatus() {
        return companyNeedStatus;
    }

    public void setCompanyNeedStatus(Integer companyNeedStatus) {
        this.companyNeedStatus = companyNeedStatus;
    }

    public String getCompanyNeedBackup1() {
        return companyNeedBackup1;
    }

    public void setCompanyNeedBackup1(String companyNeedBackup1) {
        this.companyNeedBackup1 = companyNeedBackup1 == null ? null : companyNeedBackup1.trim();
    }

    public String getCompanyNeedBackup2() {
        return companyNeedBackup2;
    }

    public void setCompanyNeedBackup2(String companyNeedBackup2) {
        this.companyNeedBackup2 = companyNeedBackup2 == null ? null : companyNeedBackup2.trim();
    }
}