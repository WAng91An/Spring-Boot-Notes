package com.wrq.boot.component;

import com.wrq.boot.exception.UserIsNoExist;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangqian on 2019/1/16.
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 浏览器和其他客户端都返回的是Json
     * @param e
     * @return
     */
//    @ResponseBody
//    @ExceptionHandler(UserIsNoExist.class)
//    public Map<String, Object> handlerException (Exception e) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("code", "用户不存在");
//        map.put("message", e.getMessage());
//        return map;
//    }

    /**
     * 请求 /error  这个时候就会调用Spring Boot默认配置的组件处理
     * @param e
     * @return
     */
    @ExceptionHandler(UserIsNoExist.class)
    public String  handlerException (Exception e, HttpServletRequest request) {
        HashMap<String, Object> map = new HashMap<>();
        /**
         * 必须自定义状态码，如何不自定义无法跳转到我们自己创建的5xx和4xx的错误页面
         */
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "用户不存在");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}
