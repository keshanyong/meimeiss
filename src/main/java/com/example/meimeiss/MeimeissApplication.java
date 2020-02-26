package com.example.meimeiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 项目启动类
 * @author KE
 *
 */
@SpringBootApplication
public class MeimeissApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MeimeissApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MeimeissApplication.class, args);
    }

}
