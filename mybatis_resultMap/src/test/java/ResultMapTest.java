import com.atwzs.mybatis.mapper.DeptMapper;
import com.atwzs.mybatis.mapper.EmpMapper;
import com.atwzs.mybatis.pojo.Dept;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName ResultMapTest
 * @Description
 * @Author WangZhisheng
 * @Date 17:19 2022/11/8
 * @Version 11.0.15
 */
public class ResultMapTest {

    @Test
    public void testGetEmpByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(2);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(emp.getEmpName());
    }

    @Test
    public void testGetDeptAndEmpByDeptId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
    }

    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(2);
        System.out.println(dept.getDeptName());
    }
}
