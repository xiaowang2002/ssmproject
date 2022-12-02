import com.alibaba.druid.pool.DruidDataSource;
import com.atwzs.spring.controller.UserController;
import com.atwzs.spring.dao.UserDAO;
import com.atwzs.spring.pojo.*;
import com.atwzs.spring.process.MyBeanPostProcessor;
import com.atwzs.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName TestIoc
 * @Description
 * @Author WangZhisheng
 * @Date 14:50 2022/11/22
 * @Version 11.0.15
 */
public class TestIoc {

    @Test
    public void testOne() {
        //创建ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-Context.xml");
        //通过ioc容器bead的id获取对象，因为只能获取Object，所以需要强转
        IocTest one = (IocTest) ioc.getBean("testOne");
        //调用对象的方法
        one.say();

        //通过ioc容器bead的class获取对象,无需强转
        IocTest two = ioc.getBean(IocTest.class);
        two.say();

        //通过ioc容器bead的id和class获取对象,无需强转
        IocTest three = ioc.getBean("testOne", IocTest.class);
        three.say();
    }

    @Test
    public void testStudentOne() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Student one = ioc.getBean("studentOne", Student.class);
        System.out.println(one);
    }

    @Test
    public void testStudentTwo() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Student two = (Student) ioc.getBean("studentTwo");
        System.out.println(two);
    }

    @Test
    public void testStudentThree() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Student three = ioc.getBean("studentSix", Student.class);
        System.out.println(three);
    }

    @Test
    public void testStudentFour() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Clazz four = ioc.getBean("clazzTwo", Clazz.class);
        System.out.println(four);
    }

    @Test
    public void testStudentFive() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Student four = ioc.getBean("studentTen", Student.class);
        System.out.println(four);
    }

    @Test
    public void testStudentSix() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        Student four = ioc.getBean("studentEleven", Student.class);
        Student four1 = ioc.getBean("studentEleven", Student.class);
        System.out.println(four == four1);
    }

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
        DataSource bean = ioc.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        Connection connection1 = bean.getConnection();
        System.out.println(connection);
        System.out.println(connection1);
    }

    @Test
    public void testLifeCycle() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-LifeCycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println("使用user中");
        System.out.println(user);
        ioc.close();
    }

    @Test
    public void testUserFactoryBean() throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-LifeCycle.xml");
        UserFactory factory = ioc.getBean(UserFactory.class);
        User user = factory.getObject();
        System.out.println(user);
    }

    @Test
    public void testAutoWire() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController controller = ioc.getBean(UserController.class);
        controller.saveUser();
        UserController bean = ioc.getBean(UserController.class);
        System.out.println(bean);
        UserService bean1 = ioc.getBean(UserService.class);
        System.out.println(bean1);
        UserDAO bean2 = ioc.getBean(UserDAO.class);
        System.out.println(bean2);
    }
}
