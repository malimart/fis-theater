package com.fis.theatre.web.dto;

import java.util.Map;

public class ActorDTO {

	private int idActor;
	private String firstName;
	private String lastName;

	private Map<String, String> showRole;

	public ActorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActorDTO(int idActor, String firstName, String lastName, Map<String, String> showRole) {
		super();
		this.idActor = idActor;
		this.firstName = firstName;
		this.lastName = lastName;
		this.showRole = showRole;
	}

	public Map<String, String> getShowRole() {
		return showRole;
	}

	public void setShowRole(Map<String, String> showRole) {
		this.showRole = showRole;
	}

	public int getIdActor() {
		return idActor;
	}

	public void setIdActor(int idActor) {
		this.idActor = idActor;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
