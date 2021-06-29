package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品销售属性表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:32:02
 **/
public class GoodsSaleAttribute implements Serializable {

    /**
     * 销售属性 id
     */
    private Long id;
    /**
     * 销售属性名称
     */
    private String name;

    private String loginId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

}