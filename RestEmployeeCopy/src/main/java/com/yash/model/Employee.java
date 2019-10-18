package com.yash.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empIdGenerator")
	@SequenceGenerator(name = "empIdGenerator", initialValue = 1000)
	@Column(name = "employee_id")
	private int empId;

	@Column(name = "employee_name")
	private String empName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salary_id")
	private Salary salary;

	@ManyToOne
	@JoinColumn(name = "dpartment_id")
	private Department department;

//	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Technology> technologies;

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

	/*
	 * public List<Technology> getTechnologies() { return technologies; }
	 * 
	 * public void setTechnologies(List<Technology> technologies) {
	 * this.technologies = technologies; }
	 */

}
