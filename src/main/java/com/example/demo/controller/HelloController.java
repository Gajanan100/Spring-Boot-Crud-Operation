package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeServiceImp;

@Controller
public class HelloController {
	public HelloController() {
		System.out.println("Hello Controller");
	}
	@Autowired
	EmployeeServiceImp esi;
	@RequestMapping("/")
	public String getIndex() {
		return "Index";		
	}
	
	@RequestMapping("/AddEmployee")
	public String addEmployee() {
		return "AddEmployee";		
	}
	
	@RequestMapping("/addnewEmployee")
	public ModelAndView AddNewEmployee(@ModelAttribute Employee emp)
	{
		esi.addEmployee(emp);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ShowPage");
		return mv;
	}
	
	@RequestMapping("/EmployeeData")
	public ModelAndView getAllEmployee() {
	  List<Employee> list=	esi.getAllEmployee();
	  ModelAndView mv=new ModelAndView();
	  mv.setViewName("AllEmployee");
	  mv.addObject("Data",list);
		return mv;
	}
	
	@RequestMapping("/deleteEmp/{id}")
	public ModelAndView DeleteEmployee(@PathVariable int id)
	{
		esi.deleteEmployee(id);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("deleteEmp");
		return mv;
		
	}
	
	@RequestMapping("/EditEmp/{id}")
	public ModelAndView EditEmployee(@PathVariable int id) {
	       Employee emp=esi.getEmployeeById(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("id", emp);
		mv.setViewName("editdata");		
		return mv;
		
	}
	@RequestMapping("/updateEmp")
	public ModelAndView UpdateEmp(@ModelAttribute Employee emp) {
		esi.updateEmployee(emp);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("UpdateData");
		return mv;
		
	}

}
