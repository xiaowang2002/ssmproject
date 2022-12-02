import com.atwzs.mybatis.mapper.EmpMapper;
import com.atwzs.mybatis.pojo.DeptExample;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.pojo.EmpExample;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestMBG
 * @Description
 * @Author WangZhisheng
 * @Date 20:31 2022/11/21
 * @Version 11.0.15
 */
public class TestMBG {

    @Test
    public void testSelectByExample() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        //查询所有的数据，直接查询即可，无需配置sql语句和映射文件
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);

        //根据条件查询
        EmpExample example = new EmpExample();
        example.setOrderByClause("age asc");  //根据年龄排序
        example.setDistinct(true);  //去重
        List<Emp> list2 = mapper.selectByExample(example); //放入条件
        list2.forEach(System.out::println);

        //根据条件查询
        EmpExample example2 = new EmpExample();
        example2.createCriteria().andEmpNameEqualTo("邓集彬").andAgeEqualTo(20);  //构造自定义条件
        List<Emp> emps = mapper.selectByExample(example2);
        System.out.println(emps);
    }

    @Test
    public void testSelectByExampleTwo(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(3, 3); //查询功能之前开启分页功能
        EmpExample example = new EmpExample();
        example.setOrderByClause("age asc");  //根据年龄排序
        example.setDistinct(true);  //去重
        List<Emp> list2 = mapper.selectByExample(example); //放入条件
        System.out.println(list2);
        System.out.println(page);  //可以输出page，查看当中的属性
    }

    @Test
    public void testSelectByExampleThree(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(3, 3); //查询功能之前开启分页功能
        EmpExample example = new EmpExample();
        example.setOrderByClause("age asc");  //根据年龄排序
        example.setDistinct(true);  //去重
        List<Emp> list2 = mapper.selectByExample(example); //放入条件
        PageInfo<Emp> pageInfo = new PageInfo<>(list2,3);
        System.out.println(page);
        System.out.println("************************************************");
        System.out.println(pageInfo);
    }
}
