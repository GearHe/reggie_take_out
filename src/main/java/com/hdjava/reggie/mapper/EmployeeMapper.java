package com.hdjava.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdjava.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HD
 * @version 1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
