package com.atwzs.spring.service.impl;

import com.atwzs.spring.service.BookService;
import com.atwzs.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName CheckoutServiceImpl
 * @Description
 * @Author WangZhisheng
 * @Date 16:51 2022/11/15
 * @Version 11.0.15
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
//    @Transactional
    public void checkOut(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId, bookId);
        }
    }
}
