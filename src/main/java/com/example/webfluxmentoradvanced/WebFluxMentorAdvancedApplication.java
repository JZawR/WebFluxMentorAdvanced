package com.example.webfluxmentoradvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class WebFluxMentorAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxMentorAdvancedApplication.class, args);
    }

}
