import com.atwzs.mybatis.mapper.CacheMapper;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName CacheMapperTest
 * @Description
 * @Author WangZhisheng
 * @Date 20:16 2022/11/9
 * @Version 11.0.15
 */
public class CacheMapperTest {

     //    Mybatis的一级缓存默认开启,而二级缓存默认关闭。

    /**
     * @description: MyBatis的一级缓存：
     * 一级缓存是SqlSession级别的缓存（即同一个会话），
     * 通过同一个SqlSession查询的数据会被缓存，
     * 下次查询相同的数据就会从缓存中直接获取，不会从数据库重新访问。
     * <p>
     * 使一级缓存失效的四种情况
     * 1. 不同SqlSession对应不同一级缓存。（即不同SqlSession，即使是相同查询条件也无用）。
     * 2. 同一个SqlSession但是查询条件不同。
     * 3. 同一个SqlSession 两次查询期间执行了任何一次针对此表增删改操作。
     * 4. 同一个SqlSession两次查询期间手动清空了缓存。
     * sqlSession.clearCache();
     * @author: WangZhisheng
     * @date: 2022/11/9 20:33
     * @param: []
     * @return: void
     **/
    @Test
    public void testGetEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpById(2);
        System.out.println(emp);
        sqlSession.clearCache(); //手动清空了缓存
//        mapper.insertEmp(new Emp(null,"邹栋",19,"男"));
        Emp emp2 = mapper.getEmpById(2);
        System.out.println(emp2);
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpById(2);
        System.out.println(emp3);
    }

    /**
     * @description: mybatis的二级缓存：
     * mybatis的二级缓存是SqlSessionFactory级别的，即通过同一个SqlSessionFactory所获取的sqlSession对象
     * 查询的数据会被缓存，在通过同一个sqlSessionFactory所获取的sqlSession查询相同的数据会从缓存中获取
     * mybatis二级缓存开启的条件
     * 1.核心配置文件，设置全局属性配置 cacheEnabled="true", 默认为 true，不需要设置
     * 2.在映射文件中设置<cache/>
     * 3.二级缓存必须是在 SQLSession **关闭或提交之后**有效。
     * 4.实体类必须实现 `Serializable` 接口。
     * 使二级缓存失效的情况：
     * 两次查询之间的任意的增删改，会使一级和二级缓存同时失效
     * <p>
     * 二级缓存各个知识：二级缓存.jpg
     * <p>
     * 缓存查询顺序
     * 1. 先查询二级缓存，因为二级缓存当中可能会有其他线程已经查询出来的数据。
     * 2. 二级缓存没有命中，则再查询一级缓存。
     * 3. 一级缓存也没有命中，则执行查询数据库。
     * 4. SQLSession关闭之后，一级缓存当中的数据会写入到二级缓存。
     * @author: WangZhisheng
     * @date: 2022/11/9 21:43
     * @param: []
     * @return: void
     **/
    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sql.openSession(true);
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        sqlSession.close();  //关闭sqlSession
        SqlSession sqlSession1 = sql.openSession(true);
        CacheMapper mapper2 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp = mapper2.getEmpById(1);
        System.out.println(emp);
        sqlSession1.close();
    }
}
