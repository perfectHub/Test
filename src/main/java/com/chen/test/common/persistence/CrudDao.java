package com.chen.test.common.persistence;

import java.util.List;

/**
 * @Package com.chen.test.common.persistence
 * @Author chenh
 * @CreateDao 2016/10/26
 * @Description Dao支持类实现
 * @Version 1.0
 */
public interface CrudDao<T> extends BaseDao {

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    T get(T entity);

    /**
     * 查询数据列表
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    /**
     * 查询所有数据列表
     * @param entity
     * @return
     */
    List<T> findAllList(T entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据(逻辑删除，修改del_flag字段为1)
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 删除数据(逻辑删除，修改del_flag字段为1)
     * @param entity
     * @return
     */
    int delete(T entity);
}
