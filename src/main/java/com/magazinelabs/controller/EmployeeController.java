package com.magazinelabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.magazinelabs.data.entity.Employee;
import com.magazinelabs.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired	
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Page<Employee> listEmployee(Pageable pageable){
		Page<Employee> employeeList = employeeService.listPerPage(pageable);
		
		return employeeList;
	} 
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	} 
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void deleteEmployee(@PathVariable long id){
		employeeService.deleteEmployee(id);
	} 

}
