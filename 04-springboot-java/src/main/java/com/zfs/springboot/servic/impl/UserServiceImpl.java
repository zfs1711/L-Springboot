package com.zfs.springboot.servic.impl;

import com.zfs.springboot.servic.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHi(String name) {
        return "Hi"+name;
    }
}
