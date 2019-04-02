package com.lm.vo;

import java.util.List;

/**
 * @ClassName SimpleCourseType
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 22:19
 * @Version 1.0
 **/
public class SimpleCourseType {
    private String value;
    private String label;
    private List<SimpleCourseType> children;

    public SimpleCourseType() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SimpleCourseType> getChildren() {
        return children;
    }

    public void setChildren(List<SimpleCourseType> children) {
        this.children = children;
    }
}
