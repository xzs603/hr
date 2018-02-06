package com.mttsui.hr.common.dto;

/**
 * @Author: zsxu2
 * @Date 2018/2/6 16:43
 */
public class DataResp<T> extends Resp {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
