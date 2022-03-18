package com.fis.theatre.web.dto;

public class VisitorDTO {

	public String firstname;
	public String lastname;
	public int visitorId;

	public VisitorDTO(String firstname, String lastname, int visitorId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.visitorId = visitorId;
	}

	public VisitorDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

}
