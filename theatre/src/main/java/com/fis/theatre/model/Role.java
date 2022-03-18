package com.fis.theatre.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the Role database table.
 * 
 */
@Entity
@NamedQuery(name = "Role.findAll", query = "SELECT u FROM Role u")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;

	private String name;

	// bi-directional many-to-one association to Acts
	@OneToMany(mappedBy = "role")
	private List<Acts> actss;

	// bi-directional many-to-one association to Shwo
	@ManyToOne
	@JoinColumn(name = "idShow")
	private ShowTheatre showt;

	public Role() {
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Acts> getActss() {
		return actss;
	}

	public void setActss(List<Acts> actss) {
		this.actss = actss;
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