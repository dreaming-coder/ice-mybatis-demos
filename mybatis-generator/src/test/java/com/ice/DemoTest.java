package com.ice;

import com.ice.mapper.EmpMapper;
import com.ice.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        mapper.selectAll().forEach(System.out::println);
    }
}
