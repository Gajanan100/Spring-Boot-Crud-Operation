package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeServices {
	
	void addEmployee(Employee emp);
	void deleteEmployee(int id);
	Employee getEmployeeById(int id );
	int updateEmployee(Employee emp);
	List<Employee>getAllEmployee();

}
