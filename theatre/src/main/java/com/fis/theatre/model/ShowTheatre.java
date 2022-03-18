package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the Show database table.
 * 
 */
@Entity
@NamedQuery(name = "ShowTheatre.findAll", query = "SELECT p FROM ShowTheatre p")
public class ShowTheatre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idShow;

	private String name;

	private String description;

	private int length;

	// bi-directional many-to-one association to Performance
	@OneToMany(mappedBy = "showt")
	private List<Performance> performances;

	// bi-directional many-to-one association to Favourites
	@OneToMany(mappedBy = "showt")
	private List<Favourites> favouritess;

	// bi-directional many-to-one association to Reziser
	@ManyToOne
	@JoinColumn(name = "idDirector")
	private Director director;

	// bi-directional many-to-one association to Role
	@OneToMany(mappedBy = "showt")
	private List<Role> roles;

	// bi-directional many-to-one association to ZanrPredstave
	@OneToMany(mappedBy = "showt")
	private List<GenreShow> genreShows;

	public ShowTheatre() {
	}

	public int getIdShow() {
		return idShow;
	}

	public void setIdShow(int idShow) {
		this.idShow = idShow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public List<Performance> getPerformances() {
		return performances;
	}

	public void setPerformances(List<Performance> performances) {
		this.performances = performances;
	}

	public List<Favourites> getFavouritess() {
		return favouritess;
	}

	public void setFavouritess(List<Favourites> favouritess) {
		this.favouritess = favouritess;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<GenreShow> getGenreShows() {
		return genreShows;
	}

	public void setGenreShows(List<GenreShow> genreShows) {
		this.genreShows = genreShows;
	}

}