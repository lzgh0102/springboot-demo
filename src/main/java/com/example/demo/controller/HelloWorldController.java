package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author leizhao
 */
@RestController
public class HelloWorldController {

    @Value("${test.value:aaa}")
    private String value;

    @Resource
    private TestBean testBean;

    @RequestMapping("/hello")
    public String sayHello() {
        // test
        return testBean.toString();
    }
}