package com.lm.model;

/**
 * @ClassName RespBean
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 10:45
 * @Version 1.0
 **/
public class RespBean {
    private String status;
    private String msg;

    public RespBean() {
    }

    public RespBean(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
