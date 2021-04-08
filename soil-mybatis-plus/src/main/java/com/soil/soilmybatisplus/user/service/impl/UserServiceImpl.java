package com.soil.soilmybatisplus.user.service.impl;

import com.soil.soilmybatisplus.user.entity.User;
import com.soil.soilmybatisplus.user.mapper.UserMapper;
import com.soil.soilmybatisplus.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author soil
 * @since 2021-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        Map<String, Object> map = new HashMap<>(2<<3 );
        return userMapper.listUser(map);
    }
}
