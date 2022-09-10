package com.example.lockpicking;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LockpickingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockpickingApplication.class, args);
    }

}
