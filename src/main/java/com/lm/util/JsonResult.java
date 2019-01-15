package com.lm.util;

/**
 * Created by kaka on 2018-12-2.
 */
public class JsonResult {

    public JsonResult(String status, Object result){
        setStatus(status);
        setResult(result);
    }
    private String status = null;

    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
