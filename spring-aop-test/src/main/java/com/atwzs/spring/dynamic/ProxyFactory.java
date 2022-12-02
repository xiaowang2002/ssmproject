package com.atwzs.spring.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName ProxyFactory
 * @Description
 * @Author WangZhisheng
 * @Date 17:10 2022/11/23
 * @Version 11.0.15
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        //newProxyInstance():创建一个代理类对象，他有三个参数，classLoader,interfaces,invocationHandler
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志[" + method.getName() + "]方法开始了，参数是:" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("日志[" + method.getName() + "]方法结束了，结果是:" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
