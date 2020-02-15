package com.zfs.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WarController {
    @RequestMapping("/boot/json")
    public @ResponseBody Object json(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","张福生");
        map.put("style","帅气逼人");
        return map;
    }
    @RequestMapping("/boot/jsp")
    public String jsp(Model model){
        model.addAttribute("name","张福生");
        return "index";
    }
}
