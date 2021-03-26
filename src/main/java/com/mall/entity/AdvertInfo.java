package com.mall.entity;

import java.io.Serializable;

/**
 * 广告信息(AdvertInfo)实体类
 *
 * @author lx
 * @since 2021-03-23 17:32:32
 */
public class AdvertInfo implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 广告类型
     */
    private Integer advertType;
    /**
     * 广告名称
     */
    private String advertName;
    /**
     * 图片地址
     */
    private String imgUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdvertType() {
        return advertType;
    }

    public void setAdvertType(Integer advertType) {
        this.advertType = advertType;
    }

    public String getAdvertName() {
        return advertName;
    }

    public void setAdvertName(String advertName) {
        this.advertName = advertName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}