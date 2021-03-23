package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@Component
public class EmployeePhService implements EmployeeService{

	@Autowired
	Employee employee;
	
	@Override
	public Employee fetchUserDetails() {
		System.out.println("Use some different logic to retun ph");
		employee.setPhoneNo("966 377 9278");
		return employee  ;
	}

}
