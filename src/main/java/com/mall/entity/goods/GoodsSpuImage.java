package com.mall.entity.goods;

import java.io.Serializable;

/**
 * spu商品图片表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:33:08
 **/
public class GoodsSpuImage implements Serializable {

    /**
     * 图片id
     */
    private Long id;
    /**
     * spu id
     */
    private Long spuId;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片url地址
     */
    private String imgUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}