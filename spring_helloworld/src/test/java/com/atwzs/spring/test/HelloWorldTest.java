package com.atwzs.spring.test;

import com.atwzs.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName HelloWorldTest
 * @Description
 * @Author WangZhisheng
 * @Date 20:56 2022/11/11
 * @Version 11.0.15
 */
public class HelloWorldTest {

    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.say();
    }
}
