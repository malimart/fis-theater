package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Favourites database table.
 * 
 */
@Entity
@NamedQuery(name="Favourites.findAll", query="SELECT o FROM Favourites o")
public class Favourites implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFavourites;

	//bi-directional many-to-one association to Visitor
	@ManyToOne
	@JoinColumn(name="idVisitor")
	private Visitor visitor;

	//bi-directional many-to-one association to Show
	@ManyToOne
	@JoinColumn(name="idShow")
	private ShowTheatre showt;

	public Favourites() {
	}

	public int getIdFavourites() {
		return idFavourites;
	}

	public void setIdFavourites(int idFavourites) {
		this.idFavourites = idFavourites;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	

	public ShowTheatre getShowt() {
		return showt;
	}

	public void setShowt(ShowTheatre showt) {
		this.showt = showt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}