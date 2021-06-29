package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品sku图片表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:32:31
 **/
public class GoodsSkuImage implements Serializable {

    /**
     * 主键，自增
     */
    private Long id;
    /**
     * sku id
     */
    private Long skuId;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * spu图片id
     */
    private Long spuImgId;
    /**
     * 1默认，0不默认
     */
    private Long isDefault;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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

    public Long getSpuImgId() {
        return spuImgId;
    }

    public void setSpuImgId(Long spuImgId) {
        this.spuImgId = spuImgId;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long isDefault) {
        this.isDefault = isDefault;
    }

}