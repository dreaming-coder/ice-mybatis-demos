package com.ice;


import com.ice.dao.UserMapper;
import com.ice.entity.User;
import com.ice.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            userList.forEach(System.out::println);
        }
    }
}

