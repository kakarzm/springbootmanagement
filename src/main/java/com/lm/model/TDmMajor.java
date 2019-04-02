package com.lm.model;

public class TDmMajor {
    private Integer id;

    private String majorcode;

    private String majorname;

    private Boolean majorstate;

    private String parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajorcode() {
        return majorcode;
    }

    public void setMajorcode(String majorcode) {
        this.majorcode = majorcode == null ? null : majorcode.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public Boolean getMajorstate() {
        return majorstate;
    }

    public void setMajorstate(Boolean majorstate) {
        this.majorstate = majorstate;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }
}