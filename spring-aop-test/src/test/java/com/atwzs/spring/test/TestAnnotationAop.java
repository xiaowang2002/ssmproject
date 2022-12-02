package com.atwzs.spring.test;

import com.atwzs.spring.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName com.atwzs.spring.test.TestAnnotationAop
 * @Description
 * @Author WangZhisheng
 * @Date 9:20 2022/11/24
 * @Version 11.0.15
 */
public class TestAnnotationAop {

    @Test
    public void testOne(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1,3);
    }
}
