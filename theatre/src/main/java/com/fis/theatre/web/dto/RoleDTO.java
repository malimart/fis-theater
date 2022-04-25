package com.fis.theatre.web.dto;

public class RoleDTO {

	private int idRole;
	private String name;

	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleDTO(int idRole, String name) {
		super();
		this.idRole = idRole;
		this.name = name;
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

}
