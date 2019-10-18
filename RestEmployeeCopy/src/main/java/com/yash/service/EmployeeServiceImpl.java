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
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee addEmployee(Employee employee) {
//		employee.getSalary().getSalaryValue();
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Salary salary = salaryRepository.findById(getEmployee(id).getSalary().getSalId()).get();
		salary.setSalaryValue(employee.getSalary().getSalaryValue());
		employee.setSalary(salary);
		return addEmployee(employee);
	}

}
