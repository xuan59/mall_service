package com.mall.entity.history;

import java.io.Serializable;
import java.util.Date;

/**
 * 浏览历史记录 实体类
 *
 * @author lx
 * @date 2021-06-23 20:49:55
 **/
public class BrowseHistory implements Serializable {

    /**
     * uuid
     */
    private String uuid;
    /**
     * 浏览商品编号
     */
    private String browseGoodsNo;
    /**
     * 浏览商品次数
     */
    private Integer browsingGoodsNumber;
    /**
     * 搜索记录
     */
    private String searchRecord;
    /**
     * 创建时间
     */
    private Date createTimestamp;
    /**
     * 创建用户
     */
    private String createUserNo;
    /**
     * 更新时间
     */
    private Date updateTimestamp;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBrowseGoodsNo() {
        return browseGoodsNo;
    }

    public void setBrowseGoodsNo(String browseGoodsNo) {
        this.browseGoodsNo = browseGoodsNo;
    }

    public Integer getBrowsingGoodsNumber() {
        return browsingGoodsNumber;
    }

    public void setBrowsingGoodsNumber(Integer browsingGoodsNumber) {
        this.browsingGoodsNumber = browsingGoodsNumber;
    }

    public String getSearchRecord() {
        return searchRecord;
    }

    public void setSearchRecord(String searchRecord) {
        this.searchRecord = searchRecord;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getCreateUserNo() {
        return createUserNo;
    }

    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

}