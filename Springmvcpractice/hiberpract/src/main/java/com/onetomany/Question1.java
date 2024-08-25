package com.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Question1{
	@Id
	private int questId;
	private String quesDesc;

	@OneToMany(mappedBy = "question")
	@JoinColumn
	private List<Answer1>answer;
	
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question1(int questId, String quesDesc, List<Answer1> answer) {
		super();
		this.questId = questId;
		this.quesDesc = quesDesc;
		this.answer = answer;
	}

	public int getQuestId() {
		return questId;
	}

	public void setQuestId(int questId) {
		this.questId = questId;
	}

	public String getQuesDesc() {
		return quesDesc;
	}

	public void setQuesDesc(String quesDesc) {
		this.quesDesc = quesDesc;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}
	
}