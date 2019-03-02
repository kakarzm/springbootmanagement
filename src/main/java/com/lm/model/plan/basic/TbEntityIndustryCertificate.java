package com.lm.model.plan.basic;

import java.util.Date;

public class TbEntityIndustryCertificate {
    private Integer industryCertificateId;

    private String industryCertificateName;

    private String industryCertificateCourse;

    private String industryCertificateSign;

    private Integer industryCertificateDept;

    private Integer industryCertificateProfession;

    private Integer industryCertificateAuthenticationType;

    private String industryCertificateModule;

    private Integer industryCertificateIdentificationSite;

    private Integer industryCertificateOrganization;

    private String industryCertificateUrl;

    private Integer industryCertificateStatus;

    private Date industryCertificateCreated;

    private Date industryCertificateUpdated;

    private String industryCertificateBackup1;

    private String industryCertificateBackup2;

    public Integer getIndustryCertificateId() {
        return industryCertificateId;
    }

    public void setIndustryCertificateId(Integer industryCertificateId) {
        this.industryCertificateId = industryCertificateId;
    }

    public String getIndustryCertificateName() {
        return industryCertificateName;
    }

    public void setIndustryCertificateName(String industryCertificateName) {
        this.industryCertificateName = industryCertificateName == null ? null : industryCertificateName.trim();
    }

    public String getIndustryCertificateCourse() {
        return industryCertificateCourse;
    }

    public void setIndustryCertificateCourse(String industryCertificateCourse) {
        this.industryCertificateCourse = industryCertificateCourse == null ? null : industryCertificateCourse.trim();
    }

    public String getIndustryCertificateSign() {
        return industryCertificateSign;
    }

    public void setIndustryCertificateSign(String industryCertificateSign) {
        this.industryCertificateSign = industryCertificateSign == null ? null : industryCertificateSign.trim();
    }

    public Integer getIndustryCertificateDept() {
        return industryCertificateDept;
    }

    public void setIndustryCertificateDept(Integer industryCertificateDept) {
        this.industryCertificateDept = industryCertificateDept;
    }

    public Integer getIndustryCertificateProfession() {
        return industryCertificateProfession;
    }

    public void setIndustryCertificateProfession(Integer industryCertificateProfession) {
        this.industryCertificateProfession = industryCertificateProfession;
    }

    public Integer getIndustryCertificateAuthenticationType() {
        return industryCertificateAuthenticationType;
    }

    public void setIndustryCertificateAuthenticationType(Integer industryCertificateAuthenticationType) {
        this.industryCertificateAuthenticationType = industryCertificateAuthenticationType;
    }

    public String getIndustryCertificateModule() {
        return industryCertificateModule;
    }

    public void setIndustryCertificateModule(String industryCertificateModule) {
        this.industryCertificateModule = industryCertificateModule == null ? null : industryCertificateModule.trim();
    }

    public Integer getIndustryCertificateIdentificationSite() {
        return industryCertificateIdentificationSite;
    }

    public void setIndustryCertificateIdentificationSite(Integer industryCertificateIdentificationSite) {
        this.industryCertificateIdentificationSite = industryCertificateIdentificationSite;
    }

    public Integer getIndustryCertificateOrganization() {
        return industryCertificateOrganization;
    }

    public void setIndustryCertificateOrganization(Integer industryCertificateOrganization) {
        this.industryCertificateOrganization = industryCertificateOrganization;
    }

    public String getIndustryCertificateUrl() {
        return industryCertificateUrl;
    }

    public void setIndustryCertificateUrl(String industryCertificateUrl) {
        this.industryCertificateUrl = industryCertificateUrl == null ? null : industryCertificateUrl.trim();
    }

    public Integer getIndustryCertificateStatus() {
        return industryCertificateStatus;
    }

    public void setIndustryCertificateStatus(Integer industryCertificateStatus) {
        this.industryCertificateStatus = industryCertificateStatus;
    }

    public Date getIndustryCertificateCreated() {
        return industryCertificateCreated;
    }

    public void setIndustryCertificateCreated(Date industryCertificateCreated) {
        this.industryCertificateCreated = industryCertificateCreated;
    }

    public Date getIndustryCertificateUpdated() {
        return industryCertificateUpdated;
    }

    public void setIndustryCertificateUpdated(Date industryCertificateUpdated) {
        this.industryCertificateUpdated = industryCertificateUpdated;
    }

    public String getIndustryCertificateBackup1() {
        return industryCertificateBackup1;
    }

    public void setIndustryCertificateBackup1(String industryCertificateBackup1) {
        this.industryCertificateBackup1 = industryCertificateBackup1 == null ? null : industryCertificateBackup1.trim();
    }

    public String getIndustryCertificateBackup2() {
        return industryCertificateBackup2;
    }

    public void setIndustryCertificateBackup2(String industryCertificateBackup2) {
        this.industryCertificateBackup2 = industryCertificateBackup2 == null ? null : industryCertificateBackup2.trim();
    }

    @Override
    public String toString() {
        return "TbEntityIndustryCertificate{" +
                "industryCertificateId=" + industryCertificateId +
                ", industryCertificateName='" + industryCertificateName + '\'' +
                ", industryCertificateCourse='" + industryCertificateCourse + '\'' +
                ", industryCertificateSign='" + industryCertificateSign + '\'' +
                ", industryCertificateDept=" + industryCertificateDept +
                ", industryCertificateProfession=" + industryCertificateProfession +
                ", industryCertificateAuthenticationType=" + industryCertificateAuthenticationType +
                ", industryCertificateModule='" + industryCertificateModule + '\'' +
                ", industryCertificateIdentificationSite=" + industryCertificateIdentificationSite +
                ", industryCertificateOrganization=" + industryCertificateOrganization +
                ", industryCertificateUrl='" + industryCertificateUrl + '\'' +
                ", industryCertificateStatus=" + industryCertificateStatus +
                ", industryCertificateCreated=" + industryCertificateCreated +
                ", industryCertificateUpdated=" + industryCertificateUpdated +
                ", industryCertificateBackup1='" + industryCertificateBackup1 + '\'' +
                ", industryCertificateBackup2='" + industryCertificateBackup2 + '\'' +
                '}';
    }
}