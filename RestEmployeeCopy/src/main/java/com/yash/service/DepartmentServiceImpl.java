package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Department;
import com.yash.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<Department>();
		departmentRepository.findAll().forEach(departments::add);
		return departments;
	}

	@Override
	public Department getDepartment(int id) {
		return departmentRepository.findById(id).orElse(null);
	}

	@Override
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(int id) {
		departmentRepository.deleteById(id);
	}

}
