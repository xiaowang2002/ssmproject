package com.atwzs.spring.test;

import com.atwzs.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AOPByXMLTest
 * @Description
 * @Author WangZhisheng
 * @Date 15:22 2022/11/14
 * @Version 11.0.15
 */
public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1,3);
    }
}
