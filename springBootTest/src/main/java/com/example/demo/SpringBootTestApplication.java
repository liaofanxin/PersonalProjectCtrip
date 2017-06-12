package com.example.demo;

import com.example.demo.web.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloController.class, args);
  }
}
