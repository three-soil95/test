package com.soil.soilmybatisplus.user.service;

import com.soil.soilmybatisplus.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author soil
 * @since 2021-04-06
 */
public interface IUserService extends IService<User> {

    /**
     * 测试接口
     * @return
     */
    List<User> listUser();
}
