package com.atwzs.transaction.service;

/**
 * @ClassName CheckoutService
 * @Description
 * @Author WangZhisheng
 * @Date 20:13 2022/11/24
 * @Version 11.0.15
 */
public interface CheckoutService {

    void checkout(Integer[] bookIds,Integer userId);
}
