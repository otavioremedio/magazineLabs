package com.magazinelabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.magazinelabs.data.entity.Employee;
import com.magazinelabs.data.repository.EmployeeRepository;
import com.magazinelabs.data.repository.EmployeeRepositoryPageable;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepositoryPageable employeeRepositoryPageable;
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepositoryPageable employeeRepositoryPageable, EmployeeRepository employeeRepository){
		this.employeeRepositoryPageable = employeeRepositoryPageable;
		this.employeeRepository = employeeRepository;
	}
	
	@Override 
	public Page<Employee> listPerPage(Pageable pageable) {
		return this.employeeRepositoryPageable.findAll(pageable);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		this.employeeRepository.delete(employeeId);
	}

}
