package com.example.meimeiss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动类
 * @author KE
 *
 */
@SpringBootApplication
@MapperScan("com.example.meimeiss.dao")
public class MeimeissApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MeimeissApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MeimeissApplication.class, args);
    }

}
