package com.atwzs.spring.proxy;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @ClassName ProxyFactory
 * @Description
 * @Author WangZhisheng
 * @Date 16:11 2022/11/13
 * @Version 11.0.15
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志，方法：" + method.getName() + "，参数：" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("日志，方法：" + method.getName() + "，结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志，方法：" + method.getName() + "，异常：" + e);
                } finally {
                    System.out.println("日志，方法：" + method.getName() + "方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
