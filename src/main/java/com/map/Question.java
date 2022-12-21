package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int Q_id;
	private String Question;
	@OneToOne
	@JoinColumn(name="AID")  //used to rename the column with foreign key
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int q_id, String question, Answer answer) {
		super();
		Q_id = q_id;
		Question = question;
		this.answer = answer;
	}
	public int getQ_id() {
		return Q_id;
	}
	public void setQ_id(int q_id) {
		Q_id = q_id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	

}
