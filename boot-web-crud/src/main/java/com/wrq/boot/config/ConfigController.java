package com.wrq.boot.config;

import com.wrq.boot.component.LoginHandlerIntercepter;
import com.wrq.boot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wangqian on 2019/1/14.
 *
 */
@Configuration
public class ConfigController extends WebMvcConfigurerAdapter {

    /**
     * 访问 http://localhost:8080/helloMan 跳转到success.html
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/helloMan").setViewName("success");
    }


    /**
     * 通过WebMvcConfigurerAdapter来自定义配置，所有的组件一起起作用，但是必须让Spring Boot知道这个组件
     * @return adapter
     */
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                // 静态资源：Spring Boot已经做好了资源映射，我们用管。
                registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                        .excludePathPatterns("/","/index.html","/user/login");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver () {
        return new MyLocaleResolver();
    }
}
