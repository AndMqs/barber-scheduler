package com.barberscheduler.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class BarberSchedulerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarberSchedulerApiApplication.class, args);
    }

}
