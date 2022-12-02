package com.atwzs.spring.test;

import com.atwzs.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ScopeTest
 * @Description
 * @Author WangZhisheng
 * @Date 13:54 2022/11/12
 * @Version 11.0.15
 */
public class ScopeTest {

    @Test
    public void testScope(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        //通过同一个ioc容器获取bean对象
        Student bean1 = ioc.getBean(Student.class);
        Student bean2 = ioc.getBean(Student.class);
        System.out.println(bean1==bean2);  //单例模式(singleton)为true
        System.out.println(bean1==bean2);  //多例模式(prototype)为false
    }

    @Test
    public void testConstructor(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        Student beam = ioc.getBean("studentOne", Student.class);
        System.out.println(beam);
    }
}
