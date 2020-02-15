package com.zfs.springboot.service;

import com.zfs.springboot.model.admininfo;

import java.util.List;

public interface AdminService {
    //查询所有的admin
    public List<admininfo>getAllAdmin();
    public int update();
}
