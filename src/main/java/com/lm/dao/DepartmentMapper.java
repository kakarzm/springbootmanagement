package com.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lm.model.Department;

/**

 */
public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
