package com.example.springsecurityforjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringSecurityForJwtApplication {

    @RestController
    public static class HelloController {
        @GetMapping("/")
        public String hello() {
            WebSecurityConfiguration
            return "Hello World";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityForJwtApplication.class, args);
    }

}
