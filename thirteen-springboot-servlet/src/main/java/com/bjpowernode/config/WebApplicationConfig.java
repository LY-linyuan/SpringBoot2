package com.bjpowernode.config;

import com.bjpowernode.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 临渊
 * @Date 2022-08-22 10:38
 */

@Configuration
public class WebApplicationConfig {

    // 定义方法, 注册Servlet类
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        // 	public ServletRegistrationBean(T servlet, String... urlMappings) {
        //		this(servlet, true, urlMappings);
        //	}
        // 第一个参数是servlet对象  第二个参数是url地址
        /*ServletRegistrationBean bean =
                new ServletRegistrationBean(new MyServlet(), "/myservlet");
        return bean;*/

        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/myservlet", "/test");  // <url-pattern>
        return bean;
    }
}
