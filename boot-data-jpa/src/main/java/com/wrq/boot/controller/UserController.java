package com.wrq.boot.controller;

import com.wrq.boot.entity.User;
import com.wrq.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangqian on 2019/1/17.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/user/{id}")
    public User getUser (@PathVariable("id") Integer id){
        User one = repository.findOne(id);
        return one;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = repository.save(user);
        return save;
    }
}
