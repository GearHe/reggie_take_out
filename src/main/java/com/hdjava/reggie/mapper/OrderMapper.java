package com.hdjava.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdjava.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}