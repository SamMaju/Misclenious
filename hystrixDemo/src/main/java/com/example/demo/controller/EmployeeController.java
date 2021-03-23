package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.impl.EmployeeIDservice;
import com.example.demo.service.impl.EmployeePhService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeIDservice employeeIDservice;
	
	@Autowired
	EmployeePhService employeePhService;

	@GetMapping("/id")
	public Employee getEmployeeID() {
		employee=employeeIDservice.fetchUserDetails();
		return employee;
	}
	@GetMapping("/ph")
	public Employee getEmployeePhoneDetails() {
		employee=employeePhService.fetchUserDetails();
		return employee;
	}
	
	@GetMapping("/welcome")
	@HystrixCommand(fallbackMethod="fallbackWelcome")
	public String welocome() throws InterruptedException{
		Thread.sleep(3000);
		return "Welcome";
		
	}
	
	public String fallbackWelcome() {
		
		return "Fallback Welcome!!";
		
	}
}
