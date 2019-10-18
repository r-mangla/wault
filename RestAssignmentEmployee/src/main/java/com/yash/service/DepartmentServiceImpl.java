package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Department;
import com.yash.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl {

	@Autowired
	DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<Department>();
		departmentRepository.findAll().forEach(departments::add);
		return departments;
	}

	public Department getDepartment(int id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public void deleteDepartment(Department department) {
		departmentRepository.delete(department);
	}

}
