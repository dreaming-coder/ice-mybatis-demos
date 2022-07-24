package com.ice.mapper;

import com.ice.entity.Emp;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp row);

    Emp selectByPrimaryKey(Integer eid);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp row);
}