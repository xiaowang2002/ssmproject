package com.atwzs.spring.test;

import com.atwzs.spring.pojo.Clazz;
import com.atwzs.spring.pojo.Person;
import com.atwzs.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketTimeoutException;

/**
 * @ClassName IOCByXMLTest
 * @Description
 * @Author WangZhisheng
 * @Date 21:12 2022/11/11
 * @Version 11.0.15
 */
public class IOCByXMLTest {

    /**
    * @description: 获取bean的三种方式
     * 1.根据bean的id获取，需要强转
     * 2.根据bean的类型获取,要求IOC容器中有且只有一个类型匹配的bean，常用
     * 3.根据bean的id和类型来获取
    * @author: WangZhisheng
    * @date: 2022/11/11 21:24
    * @param: []
    * @return: void
    **/
    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean，通过id
        Student studentOne = (Student) ioc.getBean("studentOne"); //冷知识：spring默认获取对象用的是类的无参构造器，若类没有无参构造器，则报错
        //获取bean，通过类型
        Student stu = ioc.getBean(Student.class);
        System.out.println(studentOne); //Student{sid=null, sname='null', age=null, gender='null'}
        System.out.println(stu);
        //获取bean，通过id和类型
        Student studentOne1 = ioc.getBean("studentOne", Student.class);
        System.out.println(studentOne1);
        System.out.println("*********************************");
        /*Person是接口，
        结论：根据类型来获取bean时，在满足bean唯一性的前提下(一个实现类)，其实只要看：【对象 instanceof 指定的类型】的返回结果，
        只要返回的是true就可以认定为和类型匹配，能够获取到
        即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取bean*/
        Person person = ioc.getBean(Person.class);  //多态，组件实现了接口，同样可以使用接口的类型获得组件，但前提是Bean唯一
        System.out.println(person.getClass());  //Student类型
        System.out.println(person);  //输出的是student对象
    }

    @Test
    public void testDI(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        Student stu = ioc.getBean("studentTwo", Student.class);
        System.out.println(stu);
    }

    @Test
    public void testDI2(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        Student stu = ioc.getBean("studentSix", Student.class);
        System.out.println(stu);
        System.out.println("***************************");
        /*Clazz clazzInner = ioc.getBean("clazzInner", Clazz.class);
        System.out.println(clazzInner);*/
    }

    @Test
    public void testDI3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(clazzOne);
    }
}
