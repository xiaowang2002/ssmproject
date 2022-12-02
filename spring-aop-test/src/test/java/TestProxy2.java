import com.atwzs.spring.proxy.StaticProxy;
import com.atwzs.spring.proxy.Student;
import com.atwzs.spring.proxy.StudentImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @ClassName TestProxy2
 * @Description
 * @Author WangZhisheng
 * @Date 19:46 2022/11/23
 * @Version 11.0.15
 */
public class TestProxy2 {

    @Test
    public void testStaticProxy(){
        Student student = new StudentImpl();
        StaticProxy proxy = new StaticProxy(student);
    }

    @Test
    public void testDynamicProxy(){
        StudentImpl student = new StudentImpl();
        StaticProxy proxy = new StaticProxy(student);
        Student instance = (Student)Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), proxy);
        instance.action();
    }
}
