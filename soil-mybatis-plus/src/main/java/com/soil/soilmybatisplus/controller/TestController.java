package com.soil.soilmybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Three soil
 * @Date 2021/4/6
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 测试页面跳转
     * @return
     */
    @ResponseBody
    @GetMapping("/ftl")
    public ModelAndView test(){
        System.out.println("123");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("hello","hello world123");
        return modelAndView;
    }
}
