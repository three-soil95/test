package com.ruice.mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 数据接口
 *
 * @author Three soil
 * @Date 2021/3/29
 **/
@Controller
@ResponseBody
@RequestMapping("/data")
public class RuiCeDataController {


    /**
     * 页面跳转
     * @return
     */
    @ResponseBody
    @GetMapping("/ftl")
    public ModelAndView helloTest1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("hello","hello world123");
        return modelAndView;
    }


}
