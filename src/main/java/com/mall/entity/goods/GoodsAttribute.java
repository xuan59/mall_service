package com.mall.entity.goods;

import java.io.Serializable;

/**
 * spu筛选属性 实体类
 *
 * @author lx
 * @date 2021-06-29 20:27:24
 **/
public class GoodsAttribute implements Serializable {

    /**
     * spu属性id
     */
    private Long id;
    /**
     * spu属性名称
     */
    private String attributeName;
    /**
     * 三级分类id
     */
    private Long catalog3Id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

}