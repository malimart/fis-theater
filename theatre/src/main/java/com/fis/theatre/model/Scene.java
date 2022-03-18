package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Scene database table.
 * 
 */
@Entity
@NamedQuery(name="Scene.findAll", query="SELECT s FROM Scene s")
public class Scene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idScene;

	private String naziv;

	//bi-directional many-to-one association to Performance
	@OneToMany(mappedBy="scene")
	private List<Performance> performances;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="scene")
	private List<Location> locations;

	public Scene() {
	}

	public int getIdScene() {
		return idScene;
	}

	public void setIdScene(int idScene) {
		this.idScene = idScene;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Performance> getPerformances() {
		return performances;
	}

	public void setPerformances(List<Performance> performances) {
		this.performances = performances;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}