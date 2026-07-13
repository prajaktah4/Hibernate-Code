package com.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="devloper")
public class Developer extends Employee{

	@Column(name="d_skills")
	String Skill;
	@Column(name="d_project")
	String Project;
	
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	@Override
	public String toString() {
		return "Developer [Skill=" + Skill + ", Project=" + Project + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	
	

}
	

