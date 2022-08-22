package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @Author 临渊
 * @Date 2022-08-22 11:27
 */

@Configuration
public class WebSystemConfig {

    // 注册Servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        MyServlet myServlet = new MyServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(myServlet, "/myservlet");
        return bean;
    }

    // 注册Filter
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        // 使用框架中的过滤器类
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        // 指定编码的方式
        filter.setEncoding("utf-8");
        // 指定request和response都使用utf-8
        filter.setForceEncoding(true);
        bean.setFilter(filter);
        bean.addUrlPatterns("/*");
        return bean;
    }
}
