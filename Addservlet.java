package com.tomcat;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//服务区连接继承类HttpServlet
public class Addservlet extends HttpServlet {
    @Override
    //服务器连接方法doPost
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用HttpServletRequest对象的getParameter方法参数，进行服务器的返回值的接受
        req.setCharacterEncoding("UTF-8");
        String parameter = req.getParameter("ming");
        String parameter1 = req.getParameter("jia");
        Integer integer = Integer.getInteger(parameter1);
        String parameter2 = req.getParameter("ku");
        Integer integer1 = Integer.getInteger(parameter2);
        String parameter3 = req.getParameter("zhu");
        System.out.println(parameter);
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(parameter3);


    }
}
