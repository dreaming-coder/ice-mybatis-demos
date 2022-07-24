package com.ice.mapper;

import com.ice.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getDeptByDid(@Param("did") Integer did);

    Dept getDeptAndEmpByDid(@Param("did") Integer did);

    Dept getDeptAndEmpByDid2(@Param("did") Integer did);
}
