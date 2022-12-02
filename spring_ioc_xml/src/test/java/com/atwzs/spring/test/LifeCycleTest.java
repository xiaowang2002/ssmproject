package com.atwzs.spring.test;

import com.atwzs.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName LifeCycleTest
 * @Description
 * @Author WangZhisheng
 * @Date 14:23 2022/11/12
 * @Version 11.0.15
 */
public class LifeCycleTest {

    /**
    * @description: 生命周期
     * 1.实例化
     * 2.依赖注入
     * 3.后置处理器的postProcessBeforeInitialization
     * 4.初始化，需要通过bean,需要通过bean的init-method属性指定初始化方法
     * 5.后置处理器的postProcessAfterInitialization
     * 6.IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁方法
     *
     *注意：
     * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
     * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
     *
     * bean的后置处理器会在生命周期的初始化前后添加额外的操作，
     * 需要实现BeanPostProcessor接口实现类且配置到IOC容器中，
     * 需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容器中所有bean都会执行
    * @author: WangZhisheng
    * @date: 2022/11/12 14:33
    * @param: []
    * @return: void
    **/
    @Test
    public void test(){
        //ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        /*User bean = ioc.getBean(User.class);
        System.out.println(bean);
        ioc.close();*/
    }
}
