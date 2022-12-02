package com.atwzs.spring.test;

import com.atwzs.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AutoWireByXMLTest
 * @Description
 * @Author WangZhisheng
 * @Date 20:28 2022/11/12
 * @Version 11.0.15
 */
public class AutoWireByXMLTest {

    @Test
    public void testAutoWire(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
