package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Department;

@Service
public interface DepartmentService {

	public List<Department> getAllDepartments();

	public Department getDepartment(int id);

	public Department addDepartment(Department department);

	public void deleteDepartment(int id);

}
