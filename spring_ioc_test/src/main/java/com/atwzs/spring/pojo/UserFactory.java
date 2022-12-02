package com.atwzs.spring.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName UserFactory
 * @Description
 * @Author WangZhisheng
 * @Date 22:11 2022/11/22
 * @Version 11.0.15
 */
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User(12,"王志生","123456",20);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
