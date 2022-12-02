package com.atwzs.spring.factory;

import com.atwzs.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName UserFactory
 * @Description FactoryBean是一个接口，需要创建一个类实现该接口
 * 其中有三个方法：
 *    getObject():通过一个对象交给IOC容器管理
 *    getObjectType():设置所提供的对象的类型
 *    isSingleton():所提供的对象是否单例
 * 当把FactoryBean的实现类配置为bean时，会将当前类中getObject()所返回的对象交给IOC容器管理
 * @Author WangZhisheng
 * @Date 15:12 2022/11/12
 * @Version 11.0.15
 */
public class UserFactory implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
