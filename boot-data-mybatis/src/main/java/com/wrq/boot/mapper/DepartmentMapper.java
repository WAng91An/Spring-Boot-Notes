package com.wrq.boot.mapper;

import com.wrq.boot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * Created by wangqian on 2019/1/17.
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    /**
     * Options注解：当插入一条数据后生成id，这个新生成的id会再次封装进来。
     * 加了Options注解，把插入的数据再返回的时候会把刚刚生成的id封装进去
     * @param department
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
