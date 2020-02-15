package com.zfs.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfs.springboot.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Reference
    private AdminService adminService;
    @RequestMapping("/boot/admin")
    public Object getadmininfo(@RequestParam("id") Integer id){
        return adminService.getadmininfo(1001);
    }
    @RequestMapping("/boot/sayHi")
    public Object sayHi(@RequestParam("name") String name){
        return adminService.sayHi("dubbo");
    }
}
