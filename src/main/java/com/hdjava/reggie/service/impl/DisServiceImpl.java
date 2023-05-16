package com.hdjava.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdjava.reggie.entity.Dish;
import com.hdjava.reggie.mapper.DishMapper;
import com.hdjava.reggie.service.DisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author HD
 * @version 1.0
 */
@Service
@Slf4j
public class DisServiceImpl extends ServiceImpl<DishMapper, Dish> implements DisService {
}
