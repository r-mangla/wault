package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.exception.DepartmentNotFoundException;
import com.yash.model.Department;
import com.yash.service.DepartmentServiceImpl;

import io.swagger.annotations.Api;

@Api(value = "DepartmentController")
@RestController
public class DepartmentController {

	/*
	 * @Autowired private DepartmentServiceImpl departmentService;
	 * 
	 * @GetMapping(value = "/departments", produces = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) public
	 * List<Department> getAllDepartments() { return
	 * departmentService.getAllDepartments(); }
	 * 
	 * @GetMapping(value = "/departments/{id}", produces = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) public
	 * Department getDepartment(@PathVariable int id) { Department department =
	 * departmentService.getDepartment(id); if (department == null) throw new
	 * DepartmentNotFoundException("No department exits with id : " + id); else
	 * return department; }
	 * 
	 * @PostMapping(value = "/departments", consumes = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces
	 * = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	 * public Department addDepartment(@RequestBody Department department) { return
	 * departmentService.addDepartment(department); }
	 * 
	 * @DeleteMapping(value = "/departments/{id}") public void
	 * deleteDepartment(@PathVariable int id) { Department department =
	 * departmentService.getDepartment(id); if (department == null) throw new
	 * DepartmentNotFoundException("No department exits with id : " + id); else
	 * departmentService.deleteDepartment(department); }
	 * 
	 * @PutMapping(value = "/departments/{id}", consumes = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) public
	 * Department updateDepartment(@RequestBody Department department, @PathVariable
	 * int id) { Department foundDepartment = departmentService.getDepartment(id);
	 * if (foundDepartment == null) throw new
	 * DepartmentNotFoundException("No department exits with id : " + id); else {
	 * department.setDeptId(id); return departmentService.addDepartment(department);
	 * } }
	 */
}
