package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.EnvProp;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

	@Autowired
	private EnvProp env;

	@GetMapping("/")
	public String helloPage() {
		System.out.println(env.getTest1());
		return "Hello! Spring Boot! ENV:" + env.getTest1();
	}
}
