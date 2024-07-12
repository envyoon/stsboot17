package com.yoon.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/")
public class TestController {
	
//	@Autowired
//	private TestService service;
	
	@RequestMapping(value="/test")
	public String testPage() {
		return "testPage";
	}
	
}
