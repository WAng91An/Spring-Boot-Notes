package com.wrq.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangqian on 2019/1/5.
 */

//@ResponseBody
//@Controller
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
