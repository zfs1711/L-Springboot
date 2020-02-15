package com.zfs.springboot.service;

import com.zfs.springboot.model.admininfo;

public interface AdminService {
    //查询所有的admin
    public String sayHi (String name);
    public admininfo getadmininfo(int id);
}
