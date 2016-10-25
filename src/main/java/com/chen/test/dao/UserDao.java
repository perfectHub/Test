package com.chen.test.dao;

import com.chen.test.entity.UserEntity;

/**
 * Created by Administrator on 2016/9/28.
 */
public interface UserDao {
    /**
     * 根据ID查询用户信息
     * @param id 主键ID
     * @return UserEntity对象
     */
    UserEntity selectUserById(Integer id);

    /**
     * 添加用户信息
     * @param entity 用户信息UserEntity对象
     * @return
     */
    int insertUser(UserEntity entity);

    /**
     * 根据ID修改用户嘻嘻
     * @param entity 用户信息UserEntity对象
     * @return
     */
    int updateUser(UserEntity entity);

    /**
     * 删除用户信息
     * @param id 主键ID
     * @return
     */
    int deleteUser(Integer id);
}
