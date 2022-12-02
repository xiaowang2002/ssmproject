package com.atwzs.spring.service.impl;

import com.atwzs.spring.dao.BookDao;
import com.atwzs.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 9:10 2022/11/15
 * @Version 11.0.15
 */
/*@Transactional(
//        readOnly = true,
//        timeout = 3  //默认-1，持续等待
//        noRollbackFor = ArithmeticException.class //异常还是会报，但不会回滚了
//        noRollbackForClassName = "java.lang.ArithmeticException"
)*/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    /*@Transactional(
            propagation = Propagation.REQUIRES_NEW
    )*/
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        /*try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //查询图书的价格
        Integer priceBook = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId,priceBook);

//        System.out.println(1/0);
    }
}
