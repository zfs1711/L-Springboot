package com.zfs.springboot.config;

import com.zfs.springboot.filter.HeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean heFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new HeFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }
    //字符编码过滤，等价于web.xml。方法一：
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setForceEncoding(true);
//        characterEncodingFilter.setEncoding("GBK");
//        registration.setFilter(characterEncodingFilter);
//        registration.addUrlPatterns("/*");
//        return registration;
//    }
}
