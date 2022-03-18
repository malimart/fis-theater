package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ActsInPerformance database table.
 * 
 */
@Entity
@NamedQuery(name="ActsInPerformance.findAll", query="SELECT a FROM ActsInPerformance a")
public class ActsInPerformance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idActsInPerformance;

	//bi-directional many-to-one association to Acts
	@ManyToOne
	@JoinColumn(name="idActs")
	private Acts acts;

	//bi-directional many-to-one association to Performance
	@ManyToOne
	@JoinColumn(name="idPerformance")
	private Performance performance;

	public ActsInPerformance() {
	}

	public int getIdActsInPerformance() {
		return idActsInPerformance;
	}

	public void setIdActsInPerformance(int idActsInPerformance) {
		this.idActsInPerformance = idActsInPerformance;
	}

	public Acts getActs() {
		return acts;
	}

	public void setActs(Acts acts) {
		this.acts = acts;
	}

	public Performance getPerformance() {
		return performance;
	}

	public void setPerformance(Performance performance) {
		this.performance = performance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}