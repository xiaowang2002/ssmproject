package com.atwzs.spring.controller;

import com.atwzs.spring.pojo.User;
import com.atwzs.spring.service.BookService;
import com.atwzs.spring.service.CheckoutService;
import com.atwzs.spring.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BookController
 * @Description
 * @Author WangZhisheng
 * @Date 9:05 2022/11/15
 * @Version 11.0.15
 */
@Controller
public class BookController {

    @Autowired
    private CheckoutService checkoutService;

    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void checkOut(Integer userId,Integer[] bookIds){
        checkoutService.checkOut(userId,bookIds);
    }
}
