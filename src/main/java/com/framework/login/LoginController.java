package com.framework.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {	
	
	@GetMapping("/login-template")
	public String loginTemplate() {
		return "login-template"; // /templates/login-templates.html 경로 작성
	}
	
	@PostMapping("/request-login")
	@ResponseBody
	public Map<String Object> requestLogin
}
