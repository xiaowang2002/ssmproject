package com.atwzs.springmvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @ClassName WebInit
 * @Description
 * @Author WangZhisheng
 * @Date 21:23 2022/11/28
 * @Version 11.0.15
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
    * @description: 指定spring的配置类
    * @author: WangZhisheng
    * @date: 2022/11/28 21:26
    * @param: []
    * @return: java.lang.Class<?>[]
    **/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
    * @description: 指定springMVC的配置类
    * @author: WangZhisheng
    * @date: 2022/11/28 21:27
    * @param: []
    * @return: java.lang.Class<?>[]
    **/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
    * @description: 指定DispatcherServlet的映射规则，即url-pattern
    * @author: WangZhisheng
    * @date: 2022/11/28 21:27
    * @param: []
    * @return: java.lang.String[]
    **/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //除此之外，我们还可以添加过滤器类，ctrl+o
    @Override
    protected Filter[] getServletFilters() {
        //创建编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceResponseEncoding(true);
        //创建HiddenHttpMethodFilter 过滤器就会将当前请求的请求方式转换为请求参数_method的值，因此请求参数_method的值才是最终的请求方式
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
