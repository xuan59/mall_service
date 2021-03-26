package com.mall.entity.goods;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 二级分类(GoodsCatalog2)实体类
 *
 * @author lx
 * @since 2021-03-23 17:15:18
 */
public class GoodsCatalog2 implements Serializable {
    /**
     * id
     */
    private BigInteger id;
    /**
     * 二级分类名称
     */
    private String name;
    /**
     * 一级分类id
     */
    private BigInteger catalog1Id;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(BigInteger catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

}