package com.zfs.springboot;

import com.zfs.springboot.servic.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
//    @Autowired
//    public UserService userService;
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
//        UserService userService=(UserService)context.getBean("userServiceImpl");
//        String hi=userService.sayHi("springboot java");
//        System.out.println(hi);
//    }
    @Autowired
    private UserService userService;
    //springboot本身的main方法，为了启动springboot方法
    public static void main(String[] args){
        //启动springboot，启动spring容器
        SpringApplication.run(Application.class,args);
    }
    //相当于Java程序的main方法的入口
    @Override
    public void run(String... args) throws Exception {
            String hi=userService.sayHi("spring boot java");
        System.out.println(hi);
    }
}
