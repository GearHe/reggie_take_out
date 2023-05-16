package com.hdjava.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdjava.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HD
 * @version 1.0
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
