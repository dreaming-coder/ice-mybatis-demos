package com.ice;

import com.ice.entity.Emp;
import com.ice.entity.EmpExample;
import com.ice.mapper.EmpMapper;
import com.ice.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DemoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        EmpExample example = new EmpExample();
        EmpExample.Criteria criteria = example.createCriteria();
        criteria.andSexEqualTo("男");
        List<Emp> emps = mapper.selectByExample(example);
        emps.forEach(System.out::println);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setAge(56);
        emp.setEmpName("艾希");
        emp.setEmail("666@qq.com");
        emp.setSex("女");
        emp.setDid(1);
        int i = mapper.insert(emp);
        sqlSession.commit();
        System.out.println(i);
    }
}
