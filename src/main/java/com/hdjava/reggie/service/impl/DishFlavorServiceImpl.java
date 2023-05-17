package com.hdjava.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdjava.reggie.entity.DishFlavor;
import com.hdjava.reggie.mapper.DishFlavorMapper;
import com.hdjava.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @author HD
 * @version 1.0
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
