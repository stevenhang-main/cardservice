package com.cardservice.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="card")
public class Card {
	@Id
	private int id;
	@Column(name="cardcontent")
	private String question;
	private String answer;
	@OneToOne(fetch=FetchType.EAGER, mappedBy="card")
	private Set<RatingAndComment> ratingsAndComments;
	
	
	public Card() {
		super();
	}

	public Card(int id, String question, String answer, Set<RatingAndComment> ratingsAndComments) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.ratingsAndComments = ratingsAndComments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Set<RatingAndComment> getRatingsAndComments() {
		return ratingsAndComments;
	}

	public void setRatingsAndComments(Set<RatingAndComment> ratingsAndComments) {
		this.ratingsAndComments = ratingsAndComments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + id;
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((ratingsAndComments == null) ? 0 : ratingsAndComments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (id != other.id)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (ratingsAndComments == null) {
			if (other.ratingsAndComments != null)
				return false;
		} else if (!ratingsAndComments.equals(other.ratingsAndComments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", question=" + question + ", answer=" + answer + ", ratingsAndComments="
				+ ratingsAndComments + "]";
	}
	
}
