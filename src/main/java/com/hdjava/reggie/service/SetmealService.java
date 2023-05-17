package com.hdjava.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdjava.reggie.dto.SetmealDto;
import com.hdjava.reggie.entity.Setmeal;

/**
 * @author HD
 * @version 1.0
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
}
