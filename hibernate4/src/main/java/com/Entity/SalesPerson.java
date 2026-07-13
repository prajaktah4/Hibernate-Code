package com.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="salesperson")
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
