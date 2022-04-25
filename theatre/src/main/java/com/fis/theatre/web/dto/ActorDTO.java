package com.fis.theatre.web.dto;

public class ActorDTO {

	private int idActor;
	private String firstName;
	private String lastName;

	public ActorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActorDTO(int idActor, String firstName, String lastName) {
		super();
		this.idActor = idActor;
		this.firstName = firstName;
		this.lastName = lastName;
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
