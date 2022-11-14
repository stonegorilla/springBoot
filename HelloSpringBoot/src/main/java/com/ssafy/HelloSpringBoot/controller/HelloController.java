package com.ssafy.HelloSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
	public String Hello() {
		System.out.println("안녕하세요");
		System.out.println("안녕하세요2");
		return "hello";
	}
	
}
