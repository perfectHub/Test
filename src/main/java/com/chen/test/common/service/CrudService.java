package com.chen.test.common.service;

import com.chen.test.common.persistence.CrudDao;
import com.chen.test.common.persistence.DateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Package com.chen.test.common.service
 * @Author chenh
 * @CreateDao 2016/10/27
 * @Description Service基类
 * @Version 1.0
 */
public abstract class CrudService<D extends CrudDao<T>,T extends DateEntity<T>> extends BaseService {

    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public T get(String id){
        return dao.get(id);
    }

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    public T get(T entity){
        return dao.get(entity);
    }

    /**
     * 查询列表数据
     * @param entity
     * @return
     */
    public List<T> findList(T entity){
        return dao.findList(entity);
    }

    // TODO: 2016/10/28
    /**
     * 分页（待...）
     */

    /**
     * 保存数据（插入或更新）
     * @param entity
     */
    @Transactional(readOnly = false)
    public void save(T entity){
        //。。。。。。。。。
    }

    /**
     * 删除数据
     * @param entity
     */
    @Transactional(readOnly = false)
    public void delete(T entity){
        dao.delete(entity);
    }

}
