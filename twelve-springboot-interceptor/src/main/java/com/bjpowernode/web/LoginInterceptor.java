package com.bjpowernode.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 临渊
 * @Date 2022-08-22 10:12
 */

/**
 * 自定义的拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * @param request
     * @param response
     * @param handler  被拦截的控制器对象
     * @return boolean
     *      true : 能被controller处理
     *      false : 请求被截断
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("执行了LoginInterceptor的preHandle");
        return true;
    }
}
