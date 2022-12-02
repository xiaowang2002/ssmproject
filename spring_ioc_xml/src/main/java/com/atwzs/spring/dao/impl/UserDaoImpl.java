package com.atwzs.spring.dao.impl;

import com.atwzs.spring.dao.UserDao;
import com.atwzs.spring.service.UserService;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author WangZhisheng
 * @Date 15:44 2022/11/12
 * @Version 11.0.15
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
