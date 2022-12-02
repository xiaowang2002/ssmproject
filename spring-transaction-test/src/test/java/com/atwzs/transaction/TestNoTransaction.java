package com.atwzs.transaction;

import com.atwzs.transaction.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TestNoTransaction
 * @Description
 * @Author WangZhisheng
 * @Date 19:33 2022/11/24
 * @Version 11.0.15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-Context.xml","classpath:transaction-Context.xml"})
public class TestNoTransaction {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1,1);
    }

    @Test
    public void testBuyBooks(){
        Integer[] integers = {1, 2};
        bookController.buyBooks(integers,1);
    }
}
