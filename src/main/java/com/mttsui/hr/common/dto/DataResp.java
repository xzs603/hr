package com.mttsui.hr.common.dto;

/**
 * @Author: zsxu2
 * @Date 2018/2/6 16:43
 */
public class DataResp<T> extends Resp {

    private T data;

    public DataResp() {
        super(Const.RESP_OK, Const.RESP_OK_MSG);
    }

    public DataResp(T data) {
        super(Const.RESP_OK, Const.RESP_OK_MSG);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
