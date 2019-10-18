package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.model.Salary;

public interface SalaryRepository extends CrudRepository<Salary, Integer> {

}
