package com.atwzs.spring.dao.impl;

import com.atwzs.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author WangZhisheng
 * @Date 12:16 2022/11/13
 * @Version 11.0.15
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void savaUser() {
        System.out.println("保存成功");
    }
}
