package com.ex.microservices.lab.helloworldservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Component
@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping("hello-world")
	@ResponseBody
	public String helloGet() {
		return "Hello ";
	}
}