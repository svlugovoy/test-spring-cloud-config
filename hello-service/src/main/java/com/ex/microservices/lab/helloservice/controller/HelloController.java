package com.ex.microservices.lab.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Component
@Controller
@RequestMapping("/")
public class HelloController {


	@Value("${params.hello}")
	private String value;


	@RequestMapping("hello/{name}")
	@ResponseBody
	public String helloGet(@PathVariable String name) {
		return "Hello " + name+ " number is: "+value;
	}
}
