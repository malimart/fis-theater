package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Rating database table.
 * 
 */
@Entity
@NamedQuery(name="Rating.findAll", query="SELECT o FROM Rating o")
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRating;

	private String comment;

	private String rating;

	//bi-directional many-to-one association to Performance
	@ManyToOne
	@JoinColumn(name="idPerformance")
	private Performance performance;

	//bi-directional many-to-one association to Visitor
	@ManyToOne
	@JoinColumn(name="idVisitor")
	private Visitor visitor;

	public Rating() {
	}

	public int getIdRating() {
		return idRating;
	}

	public void setIdRating(int idRating) {
		this.idRating = idRating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Performance getPerformance() {
		return performance;
	}

	public void setPerformance(Performance performance) {
		this.performance = performance;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}