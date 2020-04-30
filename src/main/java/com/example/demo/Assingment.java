package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Assingment {

	@GetMapping("/assignment1/name")
    public String index(){
        return "Canara Bank ";
    }
	
	@GetMapping("assignment1/address")
	public String address(){
        return  "Noida, Uttar Pradesh";
    }
	
	
}
