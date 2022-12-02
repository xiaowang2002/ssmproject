package com.atwzs.spring.service.impl;

import com.atwzs.spring.dao.UserDao;
import com.atwzs.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 12:15 2022/11/13
 * @Version 11.0.15
 */
@Service
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.savaUser();
    }
}
