package com.wrq.boot.controller;

import com.wrq.boot.bean.Department;
import com.wrq.boot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangqian on 2019/1/17.
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @ResponseBody
    @RequestMapping(value = "/dept/{id}", method = RequestMethod.GET)
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    /**
     * mapper中不添加Options注解，返回的json的id为空，加了Options注解，把插入的数据再返回的时候会把刚刚生成的id封装进去
     * @param department
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dept", method = RequestMethod.GET)
    public Department insertDepartment(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
}
