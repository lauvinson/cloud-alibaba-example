package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service1BootStrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1BootStrap.class, args);
    }
}
