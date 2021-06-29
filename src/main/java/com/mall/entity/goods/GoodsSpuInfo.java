package com.mall.entity.goods;

import java.io.Serializable;

/**
 * spu商品信息 实体类
 *
 * @author lx
 * @date 2021-06-29 20:33:22
 **/
public class GoodsSpuInfo implements Serializable {

    /**
     * spu id
     */
    private Long id;
    /**
     * 品牌id
     */
    private String brandName;
    /**
     * spu商品名称
     */
    private String spuName;
    /**
     * spu商品描述
     */
    private String description;
    /**
     * 三级分类id
     */
    private Long catalog3Id;
    /**
     * 店铺名
     */
    private String shopName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}