package com.sample.demoWebApp.Application;

import com.sample.demoWebApp.Repository.repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan(basePackages = {"com.sample.demoWebApp"})
@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = repository.class)
public class DemoWebApp {

    public static void main(String[] args)
    {
        SpringApplication.run(DemoWebApp.class,args);
    }
}
