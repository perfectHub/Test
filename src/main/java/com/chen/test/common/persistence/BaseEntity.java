package com.chen.test.common.persistence;

import java.io.Serializable;

/**
 * @Package com.chen.test.common.persistence
 * @Author chenh
 * @CreateDao 2016/10/28
 * @Description Entity支持类
 * @Version 1.0
 */
public class BaseEntity<T> implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 实体编号（唯一标示）
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
