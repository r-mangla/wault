package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public Employee addEmployee(Employee employee);

	public void deleteEmployee(int id);

}
