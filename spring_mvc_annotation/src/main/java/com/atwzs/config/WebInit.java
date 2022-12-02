package com.atwzs.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @ClassName WebInit
 * @Description  用来代替web.xml
 * @Author WangZhisheng
 * @Date 11:31 2022/11/19
 * @Version 11.0.15
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    //设置一个配置类代替spring的配置文件
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //设置一个配置类代替SpringMVC的配置文件
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //设置SpringMVC的前端控制器DispatcherServlet的url-pattern
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //设置当前的过滤器
    @Override
    protected Filter[] getServletFilters() {
        //创建编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        //创建请求编码的过滤器
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
