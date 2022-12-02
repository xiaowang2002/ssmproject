package com.atwzs.spring.service.impl;

import com.atwzs.spring.dao.UserDAO;
import com.atwzs.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 22:31 2022/11/22
 * @Version 11.0.15
 */
@Service
public class UserServiceImpl implements UserService {


    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Autowired
    public UserServiceImpl() {
    }

    private UserDAO userDAO;

    @Override
    public void saveUser() {
        userDAO.saveUser();
    }
}
