package com.atwzs.spring.service;

/**
 * @ClassName CheckoutService
 * @Description
 * @Author WangZhisheng
 * @Date 16:50 2022/11/15
 * @Version 11.0.15
 */
public interface CheckoutService {

    /**
    * @description: 结账
    * @author: WangZhisheng
    * @date: 2022/11/15 17:05
    * @param: [userId, bookIds]
    * @return: void
    **/
    void checkOut(Integer userId, Integer[] bookIds);
}
