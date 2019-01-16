package com.wrq.boot.controller;

import com.wrq.boot.exception.UserIsNoExist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wangqian on 2019/1/16.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello (@RequestParam("username") String username) {
        if (username.equals("123456")) {
            throw new UserIsNoExist();
        }
        return "success";
    }
}
