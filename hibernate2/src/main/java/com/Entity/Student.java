package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studentinfo")
public class Student {

	
	@Id
	@Column(name = "stdRollno")
	int roll;
	
	@Column(name="stdname")
	String name;
	
	@Column(name="stdmarks")
	double marks;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", marks=" + marks+ "]";
	}
	

}
