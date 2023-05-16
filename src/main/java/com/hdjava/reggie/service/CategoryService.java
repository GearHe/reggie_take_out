package com.hdjava.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdjava.reggie.entity.Category;
import com.hdjava.reggie.entity.Employee;

/**
 * @author HD
 * @version 1.0
 */
public interface CategoryService extends IService<Category> {
    void remove(long id);
}
