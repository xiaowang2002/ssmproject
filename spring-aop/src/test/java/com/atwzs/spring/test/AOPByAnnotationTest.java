package com.atwzs.spring.test;

import com.atwzs.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AOPTest
 * @Description
 * @Author WangZhisheng
 * @Date 12:31 2022/11/14
 * @Version 11.0.15
 */
public class AOPByAnnotationTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);  //不能获取目标对象（CalculatorImpl），不知道代理对象的类，只能获取接口
        bean.div(1,1);
    }

}
