package org.carservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* Create the main class to run Spring Boot application
* This class will start embedded Tomcat server hosting Spring Boot web application.
*/

@SpringBootApplication
public class CarServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }
}
