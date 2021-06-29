package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 三级分类 实体类
 *
 * @author lx
 * @date 2021-06-23 20:48:42
 **/
public class GoodsCatalog3 implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 三级分类名称
     */
    private String name;
    /**
     * 二级分类id
     */
    private Long catalog2Id;
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

    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
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