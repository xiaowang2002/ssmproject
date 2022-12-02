package com.atwzs.transaction.dao;

/**
 * @ClassName BookDao
 * @Description
 * @Author WangZhisheng
 * @Date 19:06 2022/11/24
 * @Version 11.0.15
 */
public interface BookDao {

    //通过id获取书的价格
    Integer getBookPriceById(Integer bookId);

    //通过id获取用户的余额
    Integer getBalanceById(Integer userId);

    //获取某书的库存
    Integer getStockById(Integer bookId);

    //更新某用户的余额
    void updateBalance(Integer userId,Integer price);

    //更新某书的库存
    void updateStock(Integer bookId);
}
