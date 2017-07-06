package com.ctrip.personal.entity.enums;

/**
 * 员工类型
 */
public enum EmpTypeEnum {
    /**
     * 外部员工
     */
    OutEmp("1"),
    /**
     * 记者
     */
    Reporter("2"),
    /**
     * 尙诚员工
     */
    SCEmp("3"),
    /**
     * 携程员工
     */
    CtripEmp("4");

    private String code;

    EmpTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
