package com.zfs.springboot.controller;
import com.zfs.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
    //读取环境配置中的数据(方法一）
    @Value("${boot.name}")
    private String name;
    @Value("${boot.location}")
    private String location;
    //（方法二）
    //自动导入
    @Autowired
    private ConfigInfo configinfo;
    @RequestMapping("/config")
    public @ResponseBody String config()
    {
        return "(方法一）"+name+"----"+location+"----(方法二)----"+configinfo.getName()+"---"+configinfo.getLocation();
    }
}
