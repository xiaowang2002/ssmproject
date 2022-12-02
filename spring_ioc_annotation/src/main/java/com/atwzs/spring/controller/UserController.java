package com.atwzs.spring.controller;

import com.atwzs.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description
 * @Author WangZhisheng
 * @Date 12:13 2022/11/13
 * @Version 11.0.15
 */
@Controller("controller")  //指定bean的id
public class UserController {

    private UserService userService;

    /*
    @Autowired的原理：
    a.默认通过byType的方式，在IOC容器中通过类型匹配某个bean为属性赋值
    b.如有多个类型匹配的bean，此时会自动转换为byName的方式实现自动装配的效果，即将要赋值的属性的属性名作为bean的id匹配某个bean为属性赋值
    c.若byType和byName的方式都无法实现自动装配，即IOC容器中有多个类型匹配的bean，且这些bean的id和要赋值的属性的属性名都不一致，此时抛异常：NoUniqueBeanDefinitionException
    d.此时可以在要赋值的属性上，添加一个注解@Qualifier，通过该注解的value属性值，指定某个bean的id,将这个bean为属性赋值
     */

    /*
       注意：若IOC容器中没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
       在@AutoWired注解中有个属性required，默认值为true,要求必须完成自动装配
       可以将required设置为false，此时能装配则装配，无法装配则使用属性的默认值
    */
    @Autowired(required = false)
    public UserController(UserService userService) {
        this.userService = userService;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void savaUser() {
        userService.saveUser();
    }
}
