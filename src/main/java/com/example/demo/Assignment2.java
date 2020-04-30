package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Assignment2 {
	@RequestMapping(value = "assignment2/banklist")
	public String bankList() {
		return "bankName";
	}
	
	@RequestMapping(value = "assignment2/bankservices")
	public String bankServices() {
		return "bankServices";
	}
}
