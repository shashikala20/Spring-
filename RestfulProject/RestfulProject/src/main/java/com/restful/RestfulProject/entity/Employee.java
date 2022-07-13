package com.restful.RestfulProject.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="employee_id")
	private int id;
	@Column(name="employee_name")
	private String name;
	@Column(name="employee_salary")
	private int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
