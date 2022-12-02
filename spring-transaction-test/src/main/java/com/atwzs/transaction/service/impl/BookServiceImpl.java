package com.atwzs.transaction.service.impl;

import com.atwzs.transaction.dao.BookDao;
import com.atwzs.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 19:13 2022/11/24
 * @Version 11.0.15
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

//    @Transactional(readOnly = false,timeout = 3,noRollbackFor = ArithmeticException.class,propagation = Propagation.REQUIRES_NEW)
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //获取图书的价格
        Integer price = bookDao.getBookPriceById(bookId);
        //获取用户的余额
        Integer balance = bookDao.getBalanceById(userId);
        bookDao.updateStock(bookId);
        bookDao.updateBalance(userId, price);
//        System.out.println(1/0);
    }
}
