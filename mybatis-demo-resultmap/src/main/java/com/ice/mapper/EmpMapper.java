package com.ice.mapper;

import com.ice.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();

    List<Emp> getEmpsByDid(@Param("did") Integer did);

    Emp getEmpById1(@Param("eid") Integer eid);

    Emp getEmpById2(@Param("eid") Integer eid);

    Emp getEmpById3(@Param("eid") Integer eid);

}
