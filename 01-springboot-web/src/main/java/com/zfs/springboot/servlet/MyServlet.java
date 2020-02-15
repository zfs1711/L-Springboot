package com.zfs.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//实现serlet
//方法一：通过注解进行实现
@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID=-4134217146900871026L;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        resp.getWriter().print("My servlet hello word");
        resp.getWriter().flush();
        resp.getWriter().close();
    }
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        this.doGet(req, resp);
    }
}
