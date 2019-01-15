package com.wrq.boot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by wangqian on 2019/1/15.
 * 自定义LocaleResolver，它的作用是：获取请求参数中的国家语言，然后返回locale对象，加入容器中替代默认的配置。
 */
public class MyLocaleResolver implements LocaleResolver{

    /**
     * 解析区域信息：获取请求参数中的国家语言，然后返回locale对象，加入容器中替代默认的配置。
     * @param request
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String parameter = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(parameter)){
            String[] parameters = parameter.split("_");
            locale = new Locale(parameters[0], parameters[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
