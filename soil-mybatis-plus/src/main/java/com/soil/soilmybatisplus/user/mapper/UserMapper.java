package com.soil.soilmybatisplus.user.mapper;

import com.soil.soilmybatisplus.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author soil
 * @since 2021-04-06
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 测试查询
     * @param map
     * @return
     */
    List<User> listUser(Map<String,Object> map);
}
