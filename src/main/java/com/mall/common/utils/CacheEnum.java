package com.mall.common.utils;

public enum CacheEnum {
    /**
    *   删除标志
    * */
    DELETE_SIGN_1("1", "已删除"),
    DELETE_SIGN_2("2", "未删除"),

    /**
     *   生效状态
     * */
    TAKE_EFFECT_1("1", "已生效"),
    TAKE_EFFECT_2("2", "未生效");

    private final String code;
    private final String name;

    CacheEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
