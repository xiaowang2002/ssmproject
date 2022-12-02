package com.atwzs.proxy;

import com.atwzs.spring.proxy.Calculator;
import com.atwzs.spring.proxy.CalculatorImpl;
import com.atwzs.spring.proxy.CalculatorStaticProxy;
import com.atwzs.spring.proxy.ProxyFactory;
import org.hamcrest.Factory;
import org.junit.Test;

/**
 * @ClassName ProxyTest
 * @Description
 * @Author WangZhisheng
 * @Date 15:59 2022/11/13
 * @Version 11.0.15
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(2, 4);
    }

    @Test
    public void testProxyFactory() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
//        proxy.div(1,0);
    }
}
