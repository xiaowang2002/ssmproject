package com.atwzs.spring.service;

/**
 * @ClassName BookService
 * @Description
 * @Author WangZhisheng
 * @Date 9:08 2022/11/15
 * @Version 11.0.15
 */
public interface BookService {
    /**
    * @description:
    * @author: WangZhisheng
    * @date: 2022/11/15 9:23
    * @param: [userId, bookId]
    * @return: void
    **/
    void buyBook(Integer userId, Integer bookId);
}
