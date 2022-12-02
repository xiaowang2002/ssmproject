package com.atwzs.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName MyBeanPostProcessor
 * @Description
 * @Author WangZhisheng
 * @Date 14:47 2022/11/12
 * @Version 11.0.15
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
    * @description: 此方法在bean的生命周期初始化之前执行
    * @author: WangZhisheng
    * @date: 2022/11/12 14:48
    * @param: [bean, beanName]
    * @return: java.lang.Object
    **/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前调用 --> postProcessBeforeInitialization");
        return bean;
    }

    /**
    * @description: 此方法在bean的生命周期初始化之后执行
    * @author: WangZhisheng
    * @date: 2022/11/12 14:48
    * @param: [bean, beanName]
    * @return: java.lang.Object
    **/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后调用 --> postProcessAfterInitialization");
        return bean;
    }
}
