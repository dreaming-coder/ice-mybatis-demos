package com.ice;

import com.ice.entity.Emp;
import com.ice.mapper.DeptMapper;
import com.ice.mapper.EmpMapper;
import com.ice.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class ResultMapTest {

    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        for (Emp emp : empMapper.getAllEmp()) {
            System.out.println(emp);
        }
    }

    @Test
    public void test02(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp1 = empMapper.getEmpById1(1);
        System.out.println(emp1);

        Emp emp2 = empMapper.getEmpById2(1);
        System.out.println(emp2);

        Emp emp3 = empMapper.getEmpById3(1);
        System.out.println(emp3);
    }

    @Test
    public void test03(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = empMapper.getEmpById3(1);
        System.out.println(emp1.getEmpName());

        Emp emp2 = empMapper.getEmpById3(1); // 这一步仍然只有一个SQL是因为存在缓存
        System.out.println(emp2);
    }

    @Test
    public void test04(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        System.out.println(mapper.getDeptAndEmpByDid(2));
        System.out.println(mapper.getDeptAndEmpByDid2(2));
    }
}
