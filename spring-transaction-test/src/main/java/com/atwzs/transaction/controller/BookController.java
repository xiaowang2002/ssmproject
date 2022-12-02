package com.atwzs.transaction.controller;

import com.atwzs.transaction.service.BookService;
import com.atwzs.transaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BookController
 * @Description
 * @Author WangZhisheng
 * @Date 19:03 2022/11/24
 * @Version 11.0.15
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer bookId,Integer userId){
        bookService.buyBook(bookId,userId);
    }

    public void buyBooks(Integer[] bookIds,Integer userId){
        checkoutService.checkout(bookIds,userId);
    }
}
