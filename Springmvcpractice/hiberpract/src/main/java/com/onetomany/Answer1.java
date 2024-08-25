package com.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Answer1 {
	@Id
	private int ansId;
	private String ansDesc;
	
	@ManyToOne
	private Question1 question;

	public Answer1(int ansId, String ansDesc, Question1 question) {
		super();
		this.ansId = ansId;
		this.ansDesc = ansDesc;
		this.question = question;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnsDesc() {
		return ansDesc;
	}

	public void setAnsDesc(String ansDesc) {
		this.ansDesc = ansDesc;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}
	
	
}
