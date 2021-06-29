package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 二级分类 实体类
 *
 * @author lx
 * @date 2021-06-23 20:48:37
 **/
public class GoodsCatalog2 implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 二级分类名称
     */
    private String name;
    /**
     * 一级分类id
     */
    private Long catalog1Id;
    /**
     * 生效状态
     */
    private String takeEffect;
    /**
     * 删除标志
     */
    private String deleteSign;


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

    public Long getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Long catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public String getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(String takeEffect) {
        this.takeEffect = takeEffect;
    }

    public String getDeleteSign() {
        return deleteSign;
    }

    public void setDeleteSign(String deleteSign) {
        this.deleteSign = deleteSign;
    }

}