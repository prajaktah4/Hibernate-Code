package com.Entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "devinfo")
@AttributeOverrides( {
	@AttributeOverride(column = @Column(name = "dev_id"), name = "id"),
	@AttributeOverride(column = @Column(name = "dev_name"), name = "name"),
	@AttributeOverride(column = @Column(name = "dev_salary"), name = "salary")
	})
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
	

