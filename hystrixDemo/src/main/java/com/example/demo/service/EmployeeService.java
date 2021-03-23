package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public Employee fetchUserDetails();
}
