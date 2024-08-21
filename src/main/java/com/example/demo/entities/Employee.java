package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees_Data")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int emp_id;
	public String emp_name;
	public double salary;
	public String position;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, double salary, String position) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.position = position;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", position=" + position
				+ "]";
	}

}
