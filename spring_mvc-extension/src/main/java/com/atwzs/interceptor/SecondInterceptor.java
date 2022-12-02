package com.atwzs.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName FirstInterceptor
 * @Description
 * SpringMVC中的拦截器有三个抽象方法：
 * preHandle：控制器方法执行之前执行preHandle()，其boolean类型的返回值表示是否拦截或放行，返回true为放行，即调用控制器方法；返回false表示拦截，即不调用控制器方法
 * postHandle：控制器方法执行之后执行postHandle()
 * afterCompletion：处理完视图和模型数据，渲染视图完毕之后执行afterCompletion()
 *
 * 多个拦截器的执行顺序和在SPringleMVC的配置文件中的配置顺序有关
 * preHandle()按照配置的顺序执行，而postHandle和afterCompletion()按照配置的反序执行
 * @Author WangZhisheng
 * @Date 22:30 2022/11/18
 * @Version 11.0.15
 */
public class SecondInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("SecondInterceptor-->preHandle");
        return true;  //返回true放行，false不放行
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("SecondInterceptor-->postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("SecondInterceptor-->afterHandle");
    }
}
