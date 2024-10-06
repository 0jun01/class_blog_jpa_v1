package com.example.demo._domain.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	// 정적 파일을 ---> 어떤 폴더에 넣어야 해? --> static에 넣어야 한다.
	// http://localhost:8080/index
	@GetMapping({ "/index", "/index2" })
	public String index1(Model model) {
		// 뷰 쪽으로 내려줄 데이터를 만들어 보자.
		String name = "길동";
		int age = 22;
		String email = "<b>a@naver.com</b>";
		String pwd = "asd123";
		List<String> pwdList = new ArrayList<>();
		pwdList.add(pwd);
		pwdList.add(pwd + "11");
		pwdList.add(pwd + "22");
		pwdList.add(pwd + "33");
		pwdList.add(pwd + "44");
		pwdList.add(pwd + "55");
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("email", email);
		model.addAttribute("pwd", pwdList);

		// src/main/resources/templates/index.mustache 를 찾을 수 있도록 파일 생성
		return "index";
	}

}
