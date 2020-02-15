package com.zfs.springboot.config;

import com.zfs.springboot.servlet.HeServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//spring boot没有xml，@configuration可以表示一个spring的xml的配置文件
@Configuration
public class ServletConfig {
    @Bean/*等价于spring中的xml配置文件*/
    public ServletRegistrationBean heServletRegistrationBean(){
        ServletRegistrationBean registration =new ServletRegistrationBean(new HeServlet(),"/heServlet");
                return registration;
    }
}
