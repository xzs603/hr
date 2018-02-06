package com.mttsui.hr.common.dto;

/**
 * @Author: zsxu2
 * @Date 2018/2/6 16:41
 */
public class Resp {

    private int code;
    private String msg;

    public Resp() {
    }

    public Resp(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
