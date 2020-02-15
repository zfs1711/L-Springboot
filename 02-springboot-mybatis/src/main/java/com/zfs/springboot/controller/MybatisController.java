package com.zfs.springboot.controller;

import com.zfs.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController//等于Controller和GET的结合
public class MybatisController {
    @Autowired//自动导入
    private AdminService adminService;
    @GetMapping("/boot/admins")//得到运行的路径
    public Object admins(){
        //线程，调用底层的线程方法
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                adminService.getAllAdmin();
            }
        };
        //并发访问，每次有25个同时进行访问数据库
        ExecutorService executorService= Executors.newFixedThreadPool(25);
        for(int i=0;i<1000;i++){
            executorService.submit(runnable);
        }
        return adminService.getAllAdmin();
    }
            @GetMapping("/boot/update")
    public Object update(){
        return adminService.update();
    }
}
