package com.hdjava.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdjava.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HD
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
