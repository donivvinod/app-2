package com.app2.demo;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class SpringSessionController {

	@GetMapping("/")
	public String process(Model model, HttpSession session) {
		System.out.println("App 2 " +   session.getId());	
		return "index";
	}

	
}