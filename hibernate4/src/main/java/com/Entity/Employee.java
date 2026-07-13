package com.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="emptype")
@Table(name="emp1")
public class Employee {

	@Id
	@Column(name= "empid")
	int id;
	@Column(name= "empname")
	String name;
	@Column(name= "empsalary")
	double salary;
	
	
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
	
}
