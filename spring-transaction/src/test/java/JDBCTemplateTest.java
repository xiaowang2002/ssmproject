import com.atwzs.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName JDBCTemplateTest
 * @Description
 * @Author WangZhisheng
 * @Date 16:25 2022/11/14
 * @Version 11.0.15
 */
//指定当前测试类在spring的测试环境中执行，此时就可以通过注入的方式直接获取IOC容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbctemplate.xml")  //classpath：类路径
public class JDBCTemplateTest {

    @Autowired  //ioc容器中有JdbcTemplate类
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql, "root", "123", 23, "女", "2434@qq.com");
    }

    @Test
    public void testGetUserById() {
//        ③查询一条数据为实体类对象
        String sql = "select * from t_user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
//        ④查询多条数据为一个list集合
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(list);
    }

    @Test
    public void testGetCount() {
//        ⑤查询单行单列的值
        String sql = "select count(*)  from t_user";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(i);
    }
}
