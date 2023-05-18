package com.hdjava.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdjava.reggie.entity.User;
import com.hdjava.reggie.mapper.UserMapper;
import com.hdjava.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author HD
 * @version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
