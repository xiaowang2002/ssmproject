package com.atwzs.spring.dao;

/**
 * @ClassName BookDao
 * @Description
 * @Author WangZhisheng
 * @Date 9:11 2022/11/15
 * @Version 11.0.15
 */
public interface BookDao {

    /**
    * @description: 根据图书的id查询图书的价格
    * @author: WangZhisheng
    * @date: 2022/11/15 9:31
    * @param: [bookId]
    * @return: java.lang.Integer
    **/
    Integer getPriceByBookId(Integer bookId);

    /**
    * @description: 更新图书的库存
    * @author: WangZhisheng
    * @date: 2022/11/15 9:32
    * @param: [bookId]
    * @return: void
    **/
    void updateStock(Integer bookId);

    /**
    * @description: 更新用户的余额
    * @author: WangZhisheng
    * @date: 2022/11/15 9:32
    * @param: [userId, priceBook]
    * @return: void
    **/
    void updateBalance(Integer userId, Integer priceBook);
}
