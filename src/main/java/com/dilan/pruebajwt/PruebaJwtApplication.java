package com.dilan.pruebajwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dilan.pruebajwt"})
public class PruebaJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaJwtApplication.class, args);
    }

}
