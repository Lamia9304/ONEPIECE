package com.onepiece;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"com.onepiece.onepiece.controller"})
@ComponentScan(basePackages={"com.onepiece.onepiece.service"})
@ComponentScan(basePackages={"com.onepiece.onepiece.mapper"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class OnepieceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnepieceApplication.class, args);
    }

}
