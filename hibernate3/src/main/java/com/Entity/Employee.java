package com.Entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // marks particular class as entity class
@Table(name = "empinfo") // marks particular table in database
public class Employee {
	
	@Id // maps primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid") // map attributes to column
	int id;
	
	@Column(name = "empname")
	String name;
	
	@Column(name = "empsalary")
	double salary;
	
	@Embedded
	Address add;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
	
	
	
	

}
