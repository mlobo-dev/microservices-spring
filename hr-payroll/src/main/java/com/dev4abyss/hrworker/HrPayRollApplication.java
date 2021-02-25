package com.dev4abyss.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class HrPayRollApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrPayRollApplication.class, args);
    }

}
