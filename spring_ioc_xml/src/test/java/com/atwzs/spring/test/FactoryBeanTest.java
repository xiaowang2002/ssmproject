package com.atwzs.spring.test;

import com.atwzs.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName FactoryBeanTest
 * @Description
 * @Author WangZhisheng
 * @Date 15:18 2022/11/12
 * @Version 11.0.15
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }
}
