import com.atwzs.spring.dynamic.Calculator;
import com.atwzs.spring.dynamic.CalculatorImpl;
import com.atwzs.spring.dynamic.ProxyFactory;
import org.junit.Test;

/**
 * @ClassName TestProxy
 * @Description
 * @Author WangZhisheng
 * @Date 17:52 2022/11/23
 * @Version 11.0.15
 */
public class TestProxy {

    @Test
    public void testProxyFactory(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(2, 3);
        System.out.println(add);
    }

}
