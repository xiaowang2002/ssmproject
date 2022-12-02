package com.atwzs.spring.test;

import com.atwzs.spring.controller.UserController;
import com.atwzs.spring.dao.UserDao;
import com.atwzs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName IOCByAnnotationTest
 * @Description
 * @Author WangZhisheng
 * @Date 12:19 2022/11/13
 * @Version 11.0.15
 */
public class IOCByAnnotationTest {

    /**
     * @description:
     * @author: WangZhisheng
     * @date: 2022/11/13 12:19
     * @param: []
     * @return: void
     **/
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController bean1 = ioc.getBean(UserController.class);
        UserService bean2 = ioc.getBean(UserService.class);
        UserDao bean3 = ioc.getBean(UserDao.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);
    }

    @Test
    public void testAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController controller = ioc.getBean("controller", UserController.class);
        controller.savaUser();
    }
}
