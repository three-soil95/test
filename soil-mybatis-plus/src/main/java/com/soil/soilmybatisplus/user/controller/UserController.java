package com.soil.soilmybatisplus.user.controller;


import com.soil.soilmybatisplus.user.entity.User;
import com.soil.soilmybatisplus.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author soil
 * @since 2021-04-06
 */
@RestController
@RequestMapping("/user/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/listUser")
    public List<User> testUser(){
        return userService.listUser();
    }

}
