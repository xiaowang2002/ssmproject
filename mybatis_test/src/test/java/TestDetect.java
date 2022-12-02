import com.atwzs.mybatis.mapper.DetectMapper;
import com.atwzs.mybatis.pojo.Detect;
import com.atwzs.mybatis.pojo.Kind;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestDetect
 * @Description
 * @Author WangZhisheng
 * @Date 11:19 2022/11/21
 * @Version 11.0.15
 */
public class TestDetect {

    @Test
    public void testGetDetectById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Detect detect = mapper.getDetectById(2);
        System.out.println(detect);
    }

    @Test
    public void testGetDetectAndKindById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Detect kind = mapper.getDetectAndKindById(4);
        System.out.println(kind);
    }

    //验证一级缓存的存在,以及他的失效情况
    @Test
    public void testGetDetectByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Detect detect = mapper.getDetectByIdStepOne(10);
        System.out.println(detect);
        /*System.out.println("********************");
        Detect detect1 = mapper.getDetectByIdStepOne(7);
        System.out.println(detect1);
        mapper.deleteDetectManyOne(new Integer[]{7});
        System.out.println("********************");
        Detect detect2 = mapper.getDetectByIdStepOne(10);
        System.out.println(detect2);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        DetectMapper mapper1 = sqlSession1.getMapper(DetectMapper.class);
        Detect detect3 = mapper1.getDetectByIdStepOne(10);
        System.out.println(detect3);*/
    }

    @Test
    public void testGetKindById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Kind black1 = mapper.getKindAndDetectById("black");
        Kind black2 = mapper.getKindAndDetectById("black");
        System.out.println(black1);
        System.out.println("******************");
        System.out.println(black2);
    }

    @Test
    public void testGetKindAndDetectByMean() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Kind obe = mapper.getKindAndDetectByStepOne("坏的");
        System.out.println(obe.getKind());
    }

    @Test
    public void testGetDetectByIdAndName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        List<Detect> list = mapper.getDetectByIdAndName(1, "库拉索");
        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteManyOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetectMapper mapper = sqlSession.getMapper(DetectMapper.class);
        Integer[] ids = {4};
        mapper.deleteDetectManyOne(ids);
    }
}
