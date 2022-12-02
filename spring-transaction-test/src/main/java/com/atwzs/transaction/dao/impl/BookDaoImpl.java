package com.atwzs.transaction.dao.impl;

import com.atwzs.transaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDaoImpl
 * @Description
 * @Author WangZhisheng
 * @Date 19:12 2022/11/24
 * @Version 11.0.15
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPriceById(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    @Override
    public Integer getBalanceById(Integer userId) {
        String sql = "select balance from t_user where user_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, userId);
    }

    @Override
    public Integer getStockById(Integer bookId) {
        String sql = "select stock from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    @Override
    public void updateBalance(Integer userId,Integer price) {
        String sql = "update t_user set balance= balance-? where user_id=?";
        jdbcTemplate.update(sql,price,userId);
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql,bookId);
    }
}
