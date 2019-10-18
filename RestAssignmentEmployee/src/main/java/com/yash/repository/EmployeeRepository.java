package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.model.Employee;
import com.yash.model.Salary;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
