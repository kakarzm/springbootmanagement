package com.lm.vo;

import java.util.List;

/**
 * @ClassName SimpleMajor
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 17:29
 * @Version 1.0
 **/
public class SimpleMajor {

    private Integer value;
    private String label;
    private String code;
    private List<SimpleMajor> children;

    public SimpleMajor() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SimpleMajor> getChildren() {
        return children;
    }

    public void setChildren(List<SimpleMajor> children) {
        this.children = children;
    }
}
