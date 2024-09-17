package com.EurekaServer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringSoapDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSoapDemo2Application.class, args);
    }

}
