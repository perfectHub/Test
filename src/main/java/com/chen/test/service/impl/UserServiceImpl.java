package com.chen.test.service.impl;

import com.chen.test.dao.UserDao;
import com.chen.test.entity.UserEntity;
import com.chen.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    public UserEntity selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    public int insertUser(UserEntity entity){
        return userDao.insertUser(entity);
    }

    public int updateUser(UserEntity entity) {
        return userDao.updateUser(entity);
    }

    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }
}
