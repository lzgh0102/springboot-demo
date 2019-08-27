package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leizhao
 */
@RestController
public class HelloWorldController {

    @Value("${test.value:aaa}")
    private String value;

    @RequestMapping("/hello")
    public String sayHello() {
        return value;
    }
}