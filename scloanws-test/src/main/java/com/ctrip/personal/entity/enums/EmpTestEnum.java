package com.ctrip.personal.entity.enums;

/**
 * Created by ljxin on 2017/7/6.
 */
public enum  EmpTestEnum {
    /**
     * 未认证
     */
    NotAuth(0),
    /**
     * 已认证
     */
    Authed(1),
    /**
     * 认证失败
     */
    AuthFailed(2),
    /**
     * 认证审核中
     */
    AuthPending(100);

    private int code;

    public int getCode(){
        return this.code;
    }

    EmpTestEnum(int code){
        this.code = code;
    }


}
