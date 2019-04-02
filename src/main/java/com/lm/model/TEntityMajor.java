package com.lm.model;

import java.util.Date;

public class TEntityMajor {
    private String id;

    private String name;

    private String englishName;

    private String code;

    private String universityId;

    private TEntityUniversity university;

    private String level;

    private String rank;

    private String majorBanxueType;

    private Integer discipline;

    private TDmMajor dmMajor;

    private String statue;

    private String createby;

    private String editby;

    private Date createtime;

    private Date edittime;

    public TEntityUniversity getUniversity() {
        return university;
    }

    public void setUniversity(TEntityUniversity university) {
        this.university = university;
    }

    public TDmMajor getDmMajor() {
        return dmMajor;
    }

    public void setDmMajor(TDmMajor dmMajor) {
        this.dmMajor = dmMajor;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId == null ? null : universityId.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getMajorBanxueType() {
        return majorBanxueType;
    }

    public void setMajorBanxueType(String majorBanxueType) {
        this.majorBanxueType = majorBanxueType == null ? null : majorBanxueType.trim();
    }

    public Integer getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Integer discipline) {
        this.discipline = discipline;
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