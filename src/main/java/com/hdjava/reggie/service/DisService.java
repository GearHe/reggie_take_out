package com.hdjava.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdjava.reggie.dto.DishDto;
import com.hdjava.reggie.entity.Dish;

/**
 * @author HD
 * @version 1.0
 */
public interface DisService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish,dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);
}
