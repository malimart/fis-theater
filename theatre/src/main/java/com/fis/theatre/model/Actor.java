package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Actor database table.
 * 
 */
@Entity
@NamedQuery(name="Actor.findAll", query="SELECT a FROM Actor a")
public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idActor;

	private String firstName;

	private String lastName;

	//bi-directional many-to-one association to Acts
	@OneToMany(mappedBy="actor")
	private List<Acts> actss;

	public Actor() {
	}

	public int getIdActor() {
		return idActor;
	}

	public void setIdActor(int idActor) {
		this.idActor = idActor;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Acts> getActss() {
		return actss;
	}

	public void setActss(List<Acts> actss) {
		this.actss = actss;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}