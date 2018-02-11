package com.mttsui.hr.common.dto;

/**
 * @Author: zsxu2
 * @Date 2018/2/11 8:39
 */
public class PageDataResp<T> extends DataResp<T> {

    private int total;

    public PageDataResp() {
    }

    public PageDataResp(T data, int total) {
        super(data);
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
