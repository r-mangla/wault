package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
