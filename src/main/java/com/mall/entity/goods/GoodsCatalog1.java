package com.mall.entity.goods;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 一级分类(GoodsCatalog1)实体类
 *
 * @author lx
 * @since 2021-03-23 17:07:15
 */
public class GoodsCatalog1 implements Serializable {
    /**
     * id
     */
    private BigInteger id;
    /**
     * 一级分类名称
     */
    private String name;


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

}