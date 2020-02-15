package com.zfs.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/heServlet")
public class HeServlet extends HttpServlet {
    private static final long serialVersionUID=-4134217146900871026L;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        resp.getWriter().print("He servlet hello word大家好，我是大帅哥");
        resp.getWriter().flush();
        resp.getWriter().close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
