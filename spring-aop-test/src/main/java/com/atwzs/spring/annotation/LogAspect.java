package com.atwzs.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName LogAspect
 * @Description
 * @Author WangZhisheng
 * @Date 8:37 2022/11/24
 * @Version 11.0.15
 */
//@Aspect
@Component      //想要操作目标方法，先放入ioc容器
public class LogAspect {

    //    @Before("execution(public int com.atwzs.spring.annotation.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {      //连接点
        String methodName = joinPoint.getSignature().getName();//获取方法名
        Object[] args = joinPoint.getArgs();    //获取方法的参数
        String s = Arrays.toString(args);
        System.out.println("logged-前置通知，方法名是" + methodName + ",参数是" + s);
    }

    //    @AfterReturning(value = "execution(public int com.atwzs.spring.annotation.CalculatorImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logged-返回通知，方法名是" + methodName + ",结果是" + result);
    }

    //    @After("test()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logged-后置通知，方法名是" + methodName);
    }

    @Pointcut("execution(* com.atwzs.spring.annotation.CalculatorImpl.*(..))")
    public void test() {  //方法名可以随便取
    }

    //    @Around("test()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            String methodName = joinPoint.getSignature().getName();
            String s = Arrays.toString(joinPoint.getArgs());
            System.out.println("环绕通知，目标方法执行之前");
            result = joinPoint.proceed();  //调用目标方法，获取目标方法返回值
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}