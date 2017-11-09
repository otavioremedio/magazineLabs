package com.magazinelabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magazinelabs.data.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}