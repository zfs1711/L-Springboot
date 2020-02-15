package com.zfs.springboot.controller;

import com.zfs.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//SpringbootRESTFull开发中可以使用1.post
@RestController
public class RESTFullController {
    //http://localhost:8080/02-springboot-web/boot/user/1001
    @RequestMapping("boot/user/{id}")
    //@PathVariable可以获取到url和id的值，用于解读id值，放到Integer的id中。
    public Object user(@PathVariable("id") Integer id){
        User user=new User();
        user.setId(id);
        user.setName("dd");
        return user;
    }
    //{id}和{name}的位置可以随意放置，但是传入的数据一定要一一对应
    @RequestMapping("boot/user/{id}/{name}")
    public Object user(@PathVariable("id") Integer id,@PathVariable("name") String name){
        User user=new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
}
