package com.wrq.boot.exception;

/**
 * Created by wangqian on 2019/1/16.
 */
public class UserIsNoExist extends RuntimeException {

    public UserIsNoExist () {
        super("用户不存在");
    }
}
