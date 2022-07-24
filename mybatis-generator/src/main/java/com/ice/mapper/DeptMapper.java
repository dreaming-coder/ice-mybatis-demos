package com.ice.mapper;

import com.ice.entity.Dept;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept row);

    Dept selectByPrimaryKey(Integer did);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept row);
}