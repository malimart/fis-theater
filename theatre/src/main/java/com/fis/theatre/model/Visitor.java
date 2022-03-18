package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Visitor database table.
 * 
 */
@Entity
@NamedQuery(name="Visitor.findAll", query="SELECT p FROM Visitor p")
public class Visitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVisitor;

	private String email;

	private String firstname;

	private String password;

	private String lastname;

	private String username;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="visitor")
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="visitor")
	private List<Rating> ratings;

	//bi-directional many-to-one association to Favourites
	@OneToMany(mappedBy="visitor")
	private List<Favourites> favouritess;

	public Visitor() {
	}

	public int getIdVisitor() {
		return idVisitor;
	}

	public void setIdVisitor(int idVisitor) {
		this.idVisitor = idVisitor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Favourites> getFavouritess() {
		return favouritess;
	}

	public void setFavouritess(List<Favourites> favouritess) {
		this.favouritess = favouritess;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


}