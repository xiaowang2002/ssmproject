package com.atwzs.spring.dao.impl;

import com.atwzs.spring.dao.UserDAO;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDAOImpl
 * @Description
 * @Author WangZhisheng
 * @Date 22:30 2022/11/22
 * @Version 11.0.15
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }

}
