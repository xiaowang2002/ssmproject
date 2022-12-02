package com.atwzs.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName LoggerAspect
 * @Description 在切面中，需要通过指定的注解将方法标识为通知方法,@Before：前置通知，在目标对象方法执行之前执行
 * @Author WangZhisheng
 * @Date 10:39 2022/11/14
 * @Version 11.0.15
 */
@Component
public class LoggerAspect {

    public void beforeAdviceMethod(JoinPoint joinPoint) {
        //获取连接点的签名信息（方法名）
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + methodName + "，参数：" + args);
    }

    //后置通知，在目标对象方法的finally子句中执行
    public void afterAdviceMethod(JoinPoint joinPoint) {
        //获取连接点的签名信息（方法名）
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        System.out.println("LoggerAspect，方法名" + methodName + "后置通知");
    }

    /*
    在返回通知中若要获取目标对象方法的返回值，只需要通过@AfterReturning注解的Returning属性
    就可以将通知方法的某个参数指定为接受目标对象方法的返回值的参数
    */
    //返回通知，在目标对象方法返回值之后执行
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,返回通知,方法： " + signature.getName() + "  " + result);
    }

    /*
      在异常通知中若要获取目标对象方法的异常，只需要通过@AfterThrowing注解的throwing属性
    就可以将通知方法的某个参数指定为接受目标对象方法的异常的参数
    */
    //@AfterThrowing:异常通知，在目标对象方法的catch子句中执行
    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Exception ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,异常通知,方法： " + signature.getName() + ex);
    }

    //环绕通知根据目标对象的方法判断是否有返回值
    //若目标方法有，则环绕对象有返回值
    //若目标方法没有，则环绕对象没有返回值
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            //表示目标对象方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
