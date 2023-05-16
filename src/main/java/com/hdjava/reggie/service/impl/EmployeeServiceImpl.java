package com.hdjava.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdjava.reggie.entity.Employee;
import com.hdjava.reggie.mapper.EmployeeMapper;
import com.hdjava.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author HD
 * @version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
