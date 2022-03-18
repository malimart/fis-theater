package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Genre database table.
 * 
 */
@Entity
@NamedQuery(name="Genre.findAll", query="SELECT z FROM Genre z")
public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGenre;

	private String name;

	//bi-directional many-to-one association to GenreShow
	@OneToMany(mappedBy="genre")
	private List<GenreShow> genreShows;

	public Genre() {
	}

	public int getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GenreShow> getGenreShows() {
		return genreShows;
	}

	public void setGenreShows(List<GenreShow> genreShows) {
		this.genreShows = genreShows;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}