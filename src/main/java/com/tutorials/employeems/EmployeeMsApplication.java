package com.tutorials.employeems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMsApplication.class, args);
    }


}
