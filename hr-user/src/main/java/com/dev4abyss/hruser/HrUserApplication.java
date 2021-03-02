package com.dev4abyss.hruser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(HrUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
