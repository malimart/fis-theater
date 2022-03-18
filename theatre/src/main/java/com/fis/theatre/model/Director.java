package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Director database table.
 * 
 */
@Entity
@NamedQuery(name="Director.findAll", query="SELECT r FROM Director r")
public class Director implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDirector;

	private String firstName;

	private String lastName;

	//bi-directional many-to-one association to Predstava
	@OneToMany(mappedBy="director")
	private List<ShowTheatre> shows;

	public Director() {
	}

	public int getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
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

	
	public List<ShowTheatre> getShows() {
		return shows;
	}

	public void setShows(List<ShowTheatre> shows) {
		this.shows = shows;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}