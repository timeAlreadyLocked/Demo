package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiPengJu
 * @date 2018/7/29
 */
@SpringBootApplication
@RestController
public class StaticController {
    public static void main(String[] args) {
        SpringApplication.run(StaticController.class, args);
    }

    @GetMapping("login")
    public ResponseEntity login() {
        return ResponseEntity.ok("login");
    }
}
