package com.fis.theatre.web.dto;

public class SceneDTO {

	private String name;
	private int id;

	public SceneDTO(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public SceneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
