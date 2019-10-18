package com.yash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "salary")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "salary_id")
	private int salId;

	@Column(name = "salary_val")
	private double salaryValue;

	public Salary() {
	}

	public Salary(double salaryValue) {
		super();
		this.salaryValue = salaryValue;
	}

	public int getSalId() {
		return salId;
	}

	public void setSalId(int salId) {
		this.salId = salId;
	}

	public double getSalaryValue() {
		return salaryValue;
	}

	public void setSalaryValue(double salaryValue) {
		this.salaryValue = salaryValue;
	}

}
