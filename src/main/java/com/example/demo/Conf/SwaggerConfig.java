package com.example.demo.Conf;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("华北科技学院API")
                        .description("2023级学生实习实训演示项目")
                        .version("1.0")
                        .termsOfService("http://www.baidu.com")
                );
    }
}
