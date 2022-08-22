package com.bjpowernode.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author 临渊
 * @Date 2022-08-22 10:33
 */

// 创建servlet类
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 使用HttpServletResponse 输出数据 应答结果
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("执行了servlet对象的doGet方法");
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 使用HttpServletResponse 输出数据 应答结果
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("执行了servlet对象的doPost方法");
        out.flush();
        out.close();
    }
}
