import com.atwzs.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TxByAnnotationTest
 * @Description
 * @Author WangZhisheng
 * @Date 9:57 2022/11/15
 * @Version 11.0.15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class TxByXMLTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
//        bookController.buyBook(1,1);
        bookController.checkOut(1,new Integer[]{1,2});
    }
}
