package com.zfs.springboot.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zfs.springboot.mapper.admininfoMapper;
import com.zfs.springboot.model.admininfo;
import com.zfs.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service()//dubbo注解
public class AdminServiceImpl implements AdminService {
    @Autowired
    private admininfoMapper admininfoMapper;
    @Override
    public String sayHi(String name){
        return "Hi,Springboot:"+name;
    }
    @Override
    public admininfo getadmininfo(int id){
        return admininfoMapper.selectByPrimaryKey(id);
    }
}
