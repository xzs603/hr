package com.mttsui.hr.common.dto;

/**
 * @Author: zsxu2
 * @Date 2018/2/6 16:46
 */
public class RestUtil {

    public static Resp genResp(int code, String msg){
        return new Resp(code, msg);
    }

    public static Resp genOk(String msg){
        return genResp(Const.RESP_OK, msg);
    }

    public static Resp genOk(){
        return genOk(Const.RESP_OK_MSG);
    }

    public static Resp genFail(String msg){
        return genResp(Const.RESP_FAIL, msg);
    }

    public static Resp genFail(){
        return genOk(Const.RESP_FAIL_MSG);
    }

}
