package com.omersolutions.jpsownstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(JsonPlaceHolderServiceProperties.class)
@SpringBootApplication
public class JpsOwnStartedApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpsOwnStartedApplication.class, args);
    }
}