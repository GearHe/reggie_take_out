package com.hdjava.reggie.controller;

import com.hdjava.reggie.common.R;
import com.hdjava.reggie.dto.SetmealDto;
import com.hdjava.reggie.entity.Setmeal;
import com.hdjava.reggie.service.SetmealDishService;
import com.hdjava.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HD
 * @version 1.0
 * 套餐管理
 */
@RestController
@RequestMapping("/setmeal")
@Slf4j
public class SetmealController {

    @Autowired
    private SetmealService setmealService;
    @Autowired
    private SetmealDishService setmealDishService;


    /**
     * 新增套餐
     * @param setmeal
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody SetmealDto setmealDto){

        log.info("套餐信息：{}",setmealDto);

        setmealService.saveWithDish(setmealDto);
        return R.success("新增套餐成功");
    }

}
