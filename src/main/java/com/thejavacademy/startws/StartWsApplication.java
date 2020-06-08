package com.thejavacademy.startws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StartWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartWsApplication.class, args);
    }

}
