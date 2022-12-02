import com.atwzs.mybatis.mapper.UserMapper;
import com.atwzs.mybatis.pojo.User;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author WangZhisheng
 * @Date 19:36 2022/11/20
 * @Version 11.0.15
 */
public class TestUser {

    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void selectUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserById();
        System.out.println(user);
    }

    @Test
    public void selectAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectAllUser();
        list.forEach(System.out::println);
    }
}
