package com.fis.theatre.web.dto;

public class LocationDTO {

	private int seatNumber;
	private int seatRow;
	private String section;
	private String nameOfTheScene;

	public LocationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocationDTO(int seatNumber, int seatRow, String section, String nameOfTheScene) {
		super();
		this.seatNumber = seatNumber;
		this.seatRow = seatRow;
		this.section = section;
		this.nameOfTheScene = nameOfTheScene;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getNameOfTheScene() {
		return nameOfTheScene;
	}

	public void setNameOfTheScene(String nameOfTheScene) {
		this.nameOfTheScene = nameOfTheScene;
	}

}
