package com.chen.test.common.persistence;

import java.util.Date;

/**
 * @Package com.chen.test.common.persistence
 * @Author chenh
 * @CreateDao 2016/10/28
 * @Description
 * @Version 1.0
 */
public class DateEntity<T> extends BaseEntity<T> {

    private static final long serialVersionUID = 1L;

    private Date createDate;    //创建时间
    private Date updateDate;    //更新时间
    private String delFlag;     //删除标记

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}