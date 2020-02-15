package com.zfs.springboot.config;

import com.zfs.springboot.intercaptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        String[] addPathPatterns={"/boot/**"};
        String[] excludePathPatterns={"/boot/hello","/boot/index"};
        //addPathPatterns()添加要拦截的项目 excluPathPatterns()不拦截的路径
        //注册登录连接器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
