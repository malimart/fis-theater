package com.fis.theatre.web.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class PerformanceDateAndSceneNameDTO {

	private String name;
	private Date date;

	public PerformanceDateAndSceneNameDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PerformanceDateAndSceneNameDTO(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
