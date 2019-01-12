package com.wrq.boot.config;

import com.wrq.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangqian on 2019/1/12.
 */
@Configuration
public class MyConfig {

    // 将方法的返回值添加到容器之中,并且容器中这个组件的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.print("通过@Bean给容器添加组件了..");
        return new HelloService();
    }
}
