package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Department;
import com.yash.model.Employee;

@Service
public interface DepartmentService {

	public List<Department> getAllDepartment();

	public Department getDepartment(int id);

	public Department addDepartment(Employee employee);

	public void deleteDepartment(int id);

}
