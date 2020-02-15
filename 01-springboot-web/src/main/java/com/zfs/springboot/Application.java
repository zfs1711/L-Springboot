package com.zfs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.zfs.springboot.servlet","com.zfs.springboot.filter"})
public class Application {

    public static void main(String[] args) {
        //启动springboot程序，启动spring，启动tomcat的容器
        SpringApplication.run(Application.class, args);
    }

}
