package com.example.projectdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {

        "com.example.projectdemo.config",
        "com.example.projectdemo.model",
        "com.example.projectdemo.repository",
        "com.example.projectdemo.service",
})

public class ProjectdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectdemoApplication.class, args);
    }

}
