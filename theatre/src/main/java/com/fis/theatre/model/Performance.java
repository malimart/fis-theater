package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Performance database table.
 * 
 */
@Entity
@NamedQuery(name="Performance.findAll", query="SELECT i FROM Performance i")
public class Performance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerformance;

	@Temporal(TemporalType.DATE)
	private Date date;

	//bi-directional many-to-one association to ActsInPerformance
	@OneToMany(mappedBy="performance")
	private List<ActsInPerformance> actsInPerformances;

	//bi-directional many-to-one association to Show
	@ManyToOne
	@JoinColumn(name="idShow")
	private ShowTheatre showt;

	//bi-directional many-to-one association to Scene
	@ManyToOne
	@JoinColumn(name="idScene")
	private Scene scene;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="performance")
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="performance")
	private List<Rating> ratings;

	public Performance() {
	}

	public int getIdPerformance() {
		return idPerformance;
	}

	public void setIdPerformance(int idPerformance) {
		this.idPerformance = idPerformance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<ActsInPerformance> getActsInPerformances() {
		return actsInPerformances;
	}

	public void setActsInPerformances(List<ActsInPerformance> actsInPerformances) {
		this.actsInPerformances = actsInPerformances;
	}

	
	public ShowTheatre getShowt() {
		return showt;
	}

	public void setShowt(ShowTheatre showt) {
		this.showt = showt;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}