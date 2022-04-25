package com.fis.theatre.web.dto;

public class GenreDTO {
	private int idGenre;
	private String name;

	public GenreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenreDTO(int idGenre, String name) {
		super();
		this.idGenre = idGenre;
		this.name = name;
	}

	public int getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
