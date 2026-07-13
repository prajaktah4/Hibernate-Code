package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	
	@Id
	@Column
	int id;
	
	@Column
	String quuestion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	Answer ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuuestion() {
		return quuestion;
	}

	public void setQuuestion(String quuestion) {
		this.quuestion = quuestion;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
}
