package com.magazinelabs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.magazinelabs.data.entity.Employee;

public interface EmployeeService {
	public Page<Employee> listPerPage (Pageable pageable);
	public Employee createEmployee(Employee employee);
	public void deleteEmployee(long employeeId);
}
