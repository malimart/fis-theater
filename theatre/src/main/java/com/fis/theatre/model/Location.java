package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Location database table.
 * 
 */
@Entity
@NamedQuery(name="Location.findAll", query="SELECT m FROM Location m")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLocation;

	private int seatNumber;

	private int seatRow;

	private String section;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="location")
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Scene
	@ManyToOne
	@JoinColumn(name="idScene")
	private Scene scene;

	public Location() {
	}

	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}


	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

}