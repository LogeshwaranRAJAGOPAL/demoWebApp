package com.sample.demoWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DemoWebApp {

    public static void main(String[] args)
    {
        SpringApplication.run(DemoWebApp.class,args);
    }
}