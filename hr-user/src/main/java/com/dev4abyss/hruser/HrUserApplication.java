package com.dev4abyss.hruser;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {

	private final BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Bcrypt = "+passwordEncoder.encode("123456"));
	}
}
