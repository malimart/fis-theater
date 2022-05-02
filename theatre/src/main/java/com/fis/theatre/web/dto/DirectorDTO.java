package com.fis.theatre.web.dto;

public class DirectorDTO {

	private String firstname;
	private String lastname;
	private int id;

	public DirectorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DirectorDTO(String firstname, String lastname, int id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
