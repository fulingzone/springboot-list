package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by ChenQuan on 2017/10/12.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    String home() {
        return "Hello Spring Boot!";
    }


    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.2d));
        System.out.println(new BigDecimal(0.1d).add(new BigDecimal(0.1d)));

        System.out.println(new BigDecimal(0.2f));
        System.out.println(new BigDecimal(0.1f).add(new BigDecimal(0.1f)));

        System.out.println(new BigDecimal(0.3d));
        System.out.println(new BigDecimal(0.1d).add(new BigDecimal(0.1d)).add(new BigDecimal(0.1d)));

        System.out.println(new BigDecimal(0.3f));
    }
}
