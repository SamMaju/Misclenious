package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@Component
public class EmployeeIDservice implements EmployeeService {
	@Autowired
	Employee employee;
	
	@Override
	public Employee fetchUserDetails() {
		System.out.println("fetch user ID::");
		employee.setEmpId("123");
		return employee;
	}

}
