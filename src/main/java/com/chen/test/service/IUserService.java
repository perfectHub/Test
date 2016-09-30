package com.chen.test.service;

import com.chen.test.model.UserEntity;

/**
 * Created by Administrator on 2016/9/30.
 */
public interface IUserService {
    UserEntity selectUserById(Integer id);
    int insertUser(UserEntity entity);
    int updateUser(UserEntity entity);
    int deleteUser(Integer id);
}
