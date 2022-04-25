package com.fis.theatre.web.dto;

public class RoleActorDTO {

	private int actorId;
	private int roleId;
	private int showId;
	private int performanceId;

	public RoleActorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleActorDTO(int actorId, int roleId, int showId, int performanceId) {
		super();
		this.actorId = actorId;
		this.roleId = roleId;
		this.showId = showId;
		this.performanceId = performanceId;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getPerformanceId() {
		return performanceId;
	}

	public void setPerformanceId(int performanceId) {
		this.performanceId = performanceId;
	}

}
