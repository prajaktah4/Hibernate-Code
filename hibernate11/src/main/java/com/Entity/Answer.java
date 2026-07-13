package com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table
public class Answer {

	@Id
	@Column
	int id;
	@Column
	String answer;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Question> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public List<Question> getAns() {
		return ans;
	}

	public void setAns(List<Question> ans) {
		this.ans = ans;
	}

	
	
}
