package com.atwzs.spring.service.impl;

import com.atwzs.spring.dao.UserDao;
import com.atwzs.spring.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 15:43 2022/11/12
 * @Version 11.0.15
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        userDao.saveUser();
    }

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
