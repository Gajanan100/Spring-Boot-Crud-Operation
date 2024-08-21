package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entities.Employee;

@Service
public class EmployeeServiceImp implements EmployeeServices {

	@Autowired
	EmployeeDao ed;

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		ed.save(emp);

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		ed.deleteById(id);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee>optional=ed.findById(id);
		return optional.get();
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		   int emp_id = emp.getEmp_id();
		   Optional<Employee>optional=ed.findById(emp_id);
		   
		   if(optional.isPresent()) {
			   Employee employee=optional.get();
			   employee.setEmp_id(emp.getEmp_id());
			   employee.setEmp_name(emp.getEmp_name());
			   employee.setSalary(emp.getSalary());
			   employee.setSalary(emp.getSalary());
			   
			   ed.save(employee);
			   return 1;
		   }
		return 0;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return ed.findAll();
	}

}
