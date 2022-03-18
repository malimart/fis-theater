package com.fis.theatre.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.theatre.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return testService.sayHi();
	}
	
	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return testService.sayHi() + " " + name;
	}
	
}
