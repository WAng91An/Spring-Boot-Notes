package com.wrq.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangqian on 2019/1/5.
 */

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }
}
