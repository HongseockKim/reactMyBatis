package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
@RequestMapping("/api")
public class MyController {
	@Autowired MyService myService;
	
	@GetMapping(value = "/main",produces = "application/json")
	public HashMap<String, Object>  GetMain() {
		System.out.println("메인");
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		try {
			System.out.println(myService.getTodoList().toString());	
					
			result.put("result", myService.getTodoList());
			
		} catch (Exception e) {
			System.out.println("오류발생" + e.getMessage());
		}
		
		
		return result;
	}
}
