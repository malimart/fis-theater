package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Ticket database table.
 * 
 */
@Entity
@NamedQuery(name="Ticket.findAll", query="SELECT k FROM Ticket k")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTicket;

	private double price;

	@Temporal(TemporalType.DATE)
	private Date datePayed;

	@Temporal(TemporalType.DATE)
	private Date dateReserved;

	//bi-directional many-to-one association to Performance
	@ManyToOne
	@JoinColumn(name="idPerformance")
	private Performance performance;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="idLocation")
	private Location location;

	//bi-directional many-to-one association to Visitor
	@ManyToOne
	@JoinColumn(name="idVisitor")
	private Visitor visitor;

	public Ticket() {
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDatePayed() {
		return datePayed;
	}

	public void setDatePayed(Date datePayed) {
		this.datePayed = datePayed;
	}

	public Date getDateReserved() {
		return dateReserved;
	}

	public void setDateReserved(Date dateReserved) {
		this.dateReserved = dateReserved;
	}

	public Performance getPerformance() {
		return performance;
	}

	public void setPerformance(Performance performance) {
		this.performance = performance;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}