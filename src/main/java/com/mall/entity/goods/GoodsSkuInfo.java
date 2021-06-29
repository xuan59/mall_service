package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品sku信息表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:32:42
 **/
public class GoodsSkuInfo implements Serializable {

    /**
     * 主键，自增
     */
    private Long id;
    /**
     * spu id
     */
    private Long spuId;
    /**
     * 价格
     */
    private Object price;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * sku描述
     */
    private String skuDescribe;
    /**
     * 重量
     */
    private Object weight;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 三级分类id
     */
    private Long catalog3Id;
    /**
     * 默认图片
     */
    private String skuDefaultImg;


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

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDescribe() {
        return skuDescribe;
    }

    public void setSkuDescribe(String skuDescribe) {
        this.skuDescribe = skuDescribe;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

}