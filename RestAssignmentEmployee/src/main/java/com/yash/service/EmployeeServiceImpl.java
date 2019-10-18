package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.model.Salary;
import com.yash.repository.EmployeeRepository;
import com.yash.repository.SalaryRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SalaryRepository salaryRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee addEmployee(Employee employee) {
		Salary salary = employee.getSalary();
		salary = salaryRepository.save(salary);
		employee.setSalary(salary);
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

}
