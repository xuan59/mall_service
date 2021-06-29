package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 一级分类 实体类
 *
 * @author lx
 * @date 2021-06-23 20:48:31
 **/
public class GoodsCatalog1 implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 一级分类名称
     */
    private String name;
    /**
     * 生效状态
     */
    private Integer takeEffect;
    /**
     * 删除标志
     */
    private Integer deleteSign;


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

    public Integer getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(Integer takeEffect) {
        this.takeEffect = takeEffect;
    }

    public Integer getDeleteSign() {
        return deleteSign;
    }

    public void setDeleteSign(Integer deleteSign) {
        this.deleteSign = deleteSign;
    }

}