package com.example.demo;

import com.example.demo.controller.HelloWorldController;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	private HelloWorldController helloWorldController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sayHello() {
		System.out.println(helloWorldController.sayHello());
	}

}