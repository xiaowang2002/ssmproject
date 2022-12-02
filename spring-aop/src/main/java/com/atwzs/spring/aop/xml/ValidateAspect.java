package com.atwzs.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName ValidateAspect
 * @Description
 * @Author WangZhisheng
 * @Date 14:53 2022/11/14
 * @Version 11.0.15
 */
@Component

/*
切面的优先级:可以通过@Order注解的value属性设置优先级，默认值Integer的最大值
*/

public class ValidateAspect {

    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }
}
