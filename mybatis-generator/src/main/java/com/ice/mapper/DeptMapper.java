package com.ice.mapper;

import com.ice.entity.Dept;
import com.ice.entity.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    long countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Dept row);

    int insertSelective(Dept row);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept row);

    int updateByPrimaryKey(Dept row);
}