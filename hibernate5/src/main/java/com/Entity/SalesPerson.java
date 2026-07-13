package com.Entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "spinfo")
@AttributeOverrides( {
	@AttributeOverride(column = @Column(name = "sp_id"), name = "id"),
	@AttributeOverride(column = @Column(name = "sp_name"), name = "name"),
	@AttributeOverride(column = @Column(name = "sp_salary"), name = "salary")
	})
public class SalesPerson extends Employee {

	@Column(name="client")
	String client;
	@Column(name="target")
	String target;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "SalesPerson [client=" + client + ", target=" + target + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}

	
	
	
}
