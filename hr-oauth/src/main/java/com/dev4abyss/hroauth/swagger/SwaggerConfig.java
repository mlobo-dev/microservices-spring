package com.dev4abyss.hroauth.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${spring.application.name}")
    private String projectName;
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dev4abyss"))
                .paths(PathSelectors.any())
                .build()
                .groupName("Dev 4 Abyss")
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                projectName + " API",
                "Encode and Decode various ciphers",
                "Versão beta-1.0",
                "",
                new Contact("Márcio Lôbo", "https://github.com/mlobo-dev", "mlobo.dev@gmail.com"),
                "",
                "",
                Collections.emptyList()
        );
    }
}
