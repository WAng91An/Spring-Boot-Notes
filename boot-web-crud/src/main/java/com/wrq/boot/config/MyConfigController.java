package com.wrq.boot.config;

import com.wrq.boot.filter.TestFilter;
import com.wrq.boot.servlet.TestServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by wangqian on 2019/1/16.
 */
@Configuration
public class MyConfigController {

    /**
     * 发送/helloMan 和 /filter都会被拦截
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean () {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/helloMan","/filter"));
        return filterRegistrationBean;
    }

    /**
     * 注册Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean testServlet() {
        // 访问 /servlet 的时候就会调用 TestServlet
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new TestServlet(), "/servlet");
        return servletRegistrationBean;
    }

    /**
     * 对嵌入式的容器进行配置
     * @return
     */
    @Bean
    EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setPort(8086);
            }
        };
    }
}
