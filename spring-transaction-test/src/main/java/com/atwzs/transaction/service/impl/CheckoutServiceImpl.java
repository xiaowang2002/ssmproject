package com.atwzs.transaction.service.impl;

import com.atwzs.transaction.service.BookService;
import com.atwzs.transaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName CheckoutServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 20:14 2022/11/24
 * @Version 11.0.15
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;
    
    //一次购买多本图书
//    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId,userId);
        }
    }
}
