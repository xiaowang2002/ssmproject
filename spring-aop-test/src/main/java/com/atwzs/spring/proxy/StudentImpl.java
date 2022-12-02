package com.atwzs.spring.proxy;

/**
 * @ClassName StudentImpl
 * @Description
 * @Author WangZhisheng
 * @Date 19:44 2022/11/23
 * @Version 11.0.15
 */
public class StudentImpl implements Student{
    @Override
    public void action() {
        System.out.println("我在学习");
    }
}
