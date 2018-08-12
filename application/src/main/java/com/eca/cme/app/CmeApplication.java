package com.eca.cme.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.*")

public class CmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmeApplication.class, args);
    }
}
