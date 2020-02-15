package com.zfs.springboot.controller;

import com.zfs.springboot.model.User;
import org.springframework.web.bind.annotation.*;

//RestController作用是Controller和ResponseBody的组合。缺点：无法单独返回页面
@RestController
public class MVCController {
    @RequestMapping("/mvc/config")
    public Object mvccontroller(){
        User user= new User();
        user.setId(12);
        user.setName("张福生");
        return user;
    }
    //1
    //@GetMapping的作用等价于@RequestMapping+RequestMethod.GET的方法。这种方法只可以用Get不能使用Post。
    @RequestMapping(value="/mvc/config1",method = RequestMethod.GET)
    public Object mvccontroller1(){
        User user= new User();
        user.setId(12);
        user.setName("张福生");
        return user;
    }
    @GetMapping("/mvc/config2")
    public Object mvccontroller2(){
        User user= new User();
        user.setId(12);
        user.setName("张福生");
        return user;
    }
    //浏览器的地址都是get请求不可以使用post，post用于表单的提交。
    //@PostMapping只支持post请求@PostMapping=@RequestMapping+RequestMethod.POST
    //此方法报错
    //@PutMapping=RequestMapping+Put请求方法的组合，用于修改数据，此方法可以用post的方法替换。
    //@DeleteMapping=RequestMapping+Delete的方法，此方法可以用get的方法代替。
    @PostMapping("/mvc/config3")
    public Object mvccontroller3() {
        User user = new User();
        user.setId(12);
        user.setName("张福生-post");
        return user;
    }
}
