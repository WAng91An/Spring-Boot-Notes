package com.wrq.boot.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * Created by wangqian on 2019/1/16
 */
//给容器中加入我们自定义的ErrorAttributes
@Component
public class MyErrorAttributes  extends DefaultErrorAttributes{

    // 返回值的map就是页面和json能获取所有的字段
    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {

        Map<String, Object> map =  super.getErrorAttributes(requestAttributes, includeStackTrace);
        Map<String, Object> ext = (Map<String, Object>) requestAttributes.getAttribute("ext", 0);
        map.put("ext", ext);
        return map;
    }
}
