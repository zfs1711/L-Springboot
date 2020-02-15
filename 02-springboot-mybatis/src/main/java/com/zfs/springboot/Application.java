package com.zfs.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication//自动扫面所有的Controller
@MapperScan("com.zfs.springboot.mapper")//使用mapper可以进行扫描，还可以在接口处加上标签@Mapper
@EnableTransactionManagement//开启springboot事务的管理
public class Application {
    //psvm主类的快捷方式
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
//RESTFull一种互联网软件架构设计的风格。优点：接口简介，有层次。