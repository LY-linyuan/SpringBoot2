package com.bjpowernode.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author 临渊
 * @Date 2022-08-22 10:55
 */

// 自定义过滤器类
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("执行了MyFilter的doFilter  ");
        chain.doFilter(request, response);
    }
}
