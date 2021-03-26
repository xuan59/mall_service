package com.mall.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * 浏览记录(BrowsingHistory)实体类
 *
 * @author lx
 * @since 2021-03-23 17:44:48
 */
public class BrowsingHistory implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 浏览名称
     */
    private String browsingName;
    /**
     * 浏览次数
     */
    private BigInteger browsingNumber;
    /**
     * 浏览时间
     */
    private Date browsingDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBrowsingName() {
        return browsingName;
    }

    public void setBrowsingName(String browsingName) {
        this.browsingName = browsingName;
    }

    public BigInteger getBrowsingNumber() {
        return browsingNumber;
    }

    public void setBrowsingNumber(BigInteger browsingNumber) {
        this.browsingNumber = browsingNumber;
    }

    public Date getBrowsingDate() {
        return browsingDate;
    }

    public void setBrowsingDate(Date browsingDate) {
        this.browsingDate = browsingDate;
    }

}