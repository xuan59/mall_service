package com.mall.entity.goods;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 三级分类(GoodsCatalog3)实体类
 *
 * @author lx
 * @since 2021-03-23 17:36:49
 */
public class GoodsCatalog3 implements Serializable {
    private static final long serialVersionUID = 526215757685251035L;
    /**
     * id
     */
    private BigInteger id;
    /**
     * 三级分类名称
     */
    private String name;
    /**
     * 二级分类id
     */
    private BigInteger catalog2Id;


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

    public BigInteger getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(BigInteger catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

}