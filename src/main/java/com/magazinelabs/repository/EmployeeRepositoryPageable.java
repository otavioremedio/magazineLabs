package com.magazinelabs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.magazinelabs.data.entity.Employee;

public interface EmployeeRepositoryPageable extends PagingAndSortingRepository<Employee, Integer> {
	
}
