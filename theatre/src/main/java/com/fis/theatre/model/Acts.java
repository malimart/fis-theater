package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Acts database table.
 * 
 */
@Entity
@NamedQuery(name="Acts.findAll", query="SELECT a FROM Acts a")
public class Acts implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idActs;

	//bi-directional many-to-one association to Actor
	@ManyToOne
	@JoinColumn(name="idActor")
	private Actor actor;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;

	//bi-directional many-to-one association to ActsInPerformance
	@OneToMany(mappedBy="acts")
	private List<ActsInPerformance> actsInPerformances;

	public int getIdActs() {
		return idActs;
	}

	public void setIdActs(int idActs) {
		this.idActs = idActs;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<ActsInPerformance> getActsInPerformances() {
		return actsInPerformances;
	}

	public void setActsInPerformances(List<ActsInPerformance> actsInPerformances) {
		this.actsInPerformances = actsInPerformances;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Acts() {
		super();
		// TODO Auto-generated constructor stub
	}

}