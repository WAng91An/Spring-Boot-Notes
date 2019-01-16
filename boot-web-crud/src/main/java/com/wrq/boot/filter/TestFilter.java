package com.wrq.boot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wangqian on 2019/1/16.
 */
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.print("Filter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
