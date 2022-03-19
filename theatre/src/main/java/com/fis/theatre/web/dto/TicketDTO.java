package com.fis.theatre.web.dto;

import java.util.Date;

public class TicketDTO {

	private int idTicket;
	private double price;
	private Date datePayed;
	private Date dateReserved;

	private int idPerformance;
	private int idLocation;
	private int idVisitor;

	public TicketDTO(int idTicket, double price, Date datePayed, Date dateReserved, int idPerformance, int idLocation,
			int idVisitor) {
		super();
		this.idTicket = idTicket;
		this.price = price;
		this.datePayed = datePayed;
		this.dateReserved = dateReserved;
		this.idPerformance = idPerformance;
		this.idLocation = idLocation;
		this.idVisitor = idVisitor;
	}

	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getIdPerformance() {
		return idPerformance;
	}

	public void setIdPerformance(int idPerformance) {
		this.idPerformance = idPerformance;
	}

	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public int getIdVisitor() {
		return idVisitor;
	}

	public void setIdVisitor(int idVisitor) {
		this.idVisitor = idVisitor;
	}

}
