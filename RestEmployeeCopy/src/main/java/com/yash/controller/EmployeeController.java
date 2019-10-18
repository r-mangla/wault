package com.yash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.exception.EmployeeNotFoundException;
import com.yash.model.Department;
import com.yash.model.Employee;
import com.yash.service.DepartmentService;
import com.yash.service.EmployeeService;

import io.swagger.annotations.Api;

@Api(value = "EmployeeController")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@GetMapping(value = "/employees", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "/employees/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Employee getEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null)
			throw new EmployeeNotFoundException("No employee exits with id : " + id);
		else
			return employee;
	}

	@PostMapping(value = "/employees", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Employee addEmployee(@RequestBody Employee employee) {
		Department department = departmentService.getDepartment(employee.getDepartment().getDeptId());
		if (department == null) {
			throw new EmployeeNotFoundException(
					"No Department exits with id : " + employee.getDepartment().getDeptId());
		}
		return employeeService.addEmployee(employee);
	}

	@DeleteMapping(value = "/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null)
			throw new EmployeeNotFoundException("No employee exits with id : " + id);
		else
			employeeService.deleteEmployee(employee.getEmpId());
	}

	@PutMapping(value = "/employees/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		Employee emp = employeeService.getEmployee(id);

		emp.setEmpNameif (Optional.ofNullable(employee.getEmpName()).isPresent());

		if (emp == null)
			throw new EmployeeNotFoundException("No employee exits with id : " + id);
		else {
			employee.setEmpId(id);
			return employeeService.updateEmployee(id, employee);
		}
	}
}
