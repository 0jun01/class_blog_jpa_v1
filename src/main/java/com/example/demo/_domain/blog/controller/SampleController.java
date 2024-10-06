package com.example.demo._domain.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SampleController {

	// 주소설계 - http://localhost:8080/ (GET) 요청
	@GetMapping("/")
	public String home(HttpServletRequest request) {

		// 뷰 리졸브 동작
		// hello --> src/main/resources/templates/hello.mustache
		// model.addAttribute("name", "World");
		request.setAttribute("name", "Fetch");
		
		return "hello";
	}

}
