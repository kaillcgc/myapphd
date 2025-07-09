package com.example.demo.Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")//对所有的路径
                        .allowedOriginPatterns("*")//允许所有的域名
                        .allowCredentials(true)//允许cookie等凭证
                        .allowedMethods("GET","POST","PUT","DELETE","PATCH")//允许的方法
                        .maxAge(3600);
            }
        };
    }
}
