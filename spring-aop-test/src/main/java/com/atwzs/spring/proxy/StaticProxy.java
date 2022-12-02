package com.atwzs.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StaticProxy
 * @Description
 * @Author WangZhisheng
 * @Date 19:44 2022/11/23
 * @Version 11.0.15
 */
public class StaticProxy implements InvocationHandler {

    private Object target;

    public StaticProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("功能前行为");
        method.invoke(target, args);
        System.out.println("功能后行为");
        return null;
    }
}
