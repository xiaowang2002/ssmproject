import com.atwzs.mybatis.mapper.PhoneMapper;
import com.atwzs.mybatis.pojo.Phone;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestPhone
 * @Description
 * @Author WangZhisheng
 * @Date 22:17 2022/11/20
 * @Version 11.0.15
 */
public class TestPhone {

    @Test
    public void selectPhoneById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone = mapper.selectPhoneById(1);
        System.out.println(phone);
    }

    @Test
    public void testSelectPhoneByPhoneWeightAndPhonePrice(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone = mapper.selectPhoneByPhoneWeightAndPhonePrice(3000.00f, "199");
        System.out.println(phone);
    }

    @Test
    public void testSelectPhoneByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("price",3000.00f);
        map.put("weight","199");
        Phone phone = mapper.selectPhoneByMap(map);
        System.out.println(phone);
    }

    @Test
    public void testInsertPhone(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone = new Phone(null, "oppo find x5pro", 4000.00f, "新骁龙8", "189");
        mapper.insertPhone(phone);
    }

    @Test
    public void testSelectPhoneByPrice(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone = mapper.selectPhoneByPrice(4000.00f,"189");
        System.out.println(phone);
    }

    @Test
    public void testSelectPhonePriceByPhoneName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Float price = mapper.selectPhonePriceByPhoneName("一加ace");
        System.out.println(price);
    }

    @Test
    public void testSelectAllPhone(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        List<Phone> phones = mapper.selectAllPhone();
        phones.forEach(System.out::println);
    }

    @Test
    public void testSelectAllCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Integer count = mapper.getPhoneCount();
        System.out.println(count);
    }

    @Test
    public void testSelectMapById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Map<String, Object> map = mapper.getPhoneMapById(2);
        System.out.println(map);
    }

    @Test
    public void testSelectAllPhoneMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        List<Map<String, Object>> list = mapper.getAllPhoneMap();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetMapToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Map<String, Object> map = mapper.getAllPhoneToMap();
        System.out.println(map);
    }

    @Test
    public void testGetPhoneByVaguePhoneName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Map<String, Object> map = mapper.getPhoneByVaguePhoneName("oppo");
        System.out.println(map);
    }

    @Test
    public void testInsertManyPhone(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone1 = new Phone(null, "红米k50", 2300.00f, "天机8100", "200");
        Phone phone2 = new Phone(null, "红米Note9", 1000.00f, "天机810u", "196");
        List<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        mapper.insertManyPhone(phones);
        phones.forEach(System.out::println);
    }

    @Test
    public void testDeleteManyPhone(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        String ids="9,10";
        mapper.deleteManyPhone(ids);
    }

    @Test
    public void testGetAllByTableName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        List<Phone> t_phone = mapper.getAllByTableName("t_phone");
        t_phone.forEach(System.out::println);
    }

    @Test
    public void testInsertPhoneGeyKey(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PhoneMapper mapper = sqlSession.getMapper(PhoneMapper.class);
        Phone phone = new Phone(null, "realme gt neo3", 2000.00f, "天机8100", "185");
        mapper.insertPhoneToGetKey(phone);
        System.out.println(phone);
    }
}
