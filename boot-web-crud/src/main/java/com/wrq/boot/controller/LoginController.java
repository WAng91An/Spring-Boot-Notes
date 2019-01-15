package com.wrq.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by wangqian on 2019/1/14.
 */
@Controller
public class LoginController {


    /**
     * 登陆
     * @param username
     * @param password
     * @param map
     * @return
     */
    @PostMapping("/user/login")
    public String login (@RequestParam("username") String username, @RequestParam("password") String password, Map<String ,Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "12345678".equals(password)){
            session.setAttribute("LoginUser",username);
            return "redirect:/main.html";
        } else  {
            map.put("msg","登陆失败");
            return "login";
        }
    }


}
