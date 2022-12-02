package com.atwzs.spring.dao.impl;

import com.atwzs.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDaoImpl
 * @Description
 * @Author WangZhisheng
 * @Date 9:12 2022/11/15
 * @Version 11.0.15
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql, bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer priceBook) {
        String sql = "update t_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,priceBook,userId);
    }
}
