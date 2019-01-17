package com.wrq.boot.mapper;

import com.wrq.boot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangqian on 2019/1/17.
 */
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
