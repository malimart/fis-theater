package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GenreShow database table.
 * 
 */
@Entity
@NamedQuery(name="GenreShow.findAll", query="SELECT z FROM GenreShow z")
public class GenreShow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGenreShow;

	//bi-directional many-to-one association to Show
	@ManyToOne
	@JoinColumn(name="idShow")
	private ShowTheatre showt;

	//bi-directional many-to-one association to Genre
	@ManyToOne
	@JoinColumn(name="idGenre")
	private Genre genre;

	public GenreShow() {
	}

	public int getIdGenreShow() {
		return idGenreShow;
	}

	public void setIdGenreShow(int idGenreShow) {
		this.idGenreShow = idGenreShow;
	}


	public ShowTheatre getShowt() {
		return showt;
	}

	public void setShowt(ShowTheatre showt) {
		this.showt = showt;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}