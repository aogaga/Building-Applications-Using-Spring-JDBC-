package com.pluralsight.model;

public class Ride {

	private Integer Id;
	private String name;
	private int duration;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public int getDuration() {
		return duration;
	}

	public String getName() {
		return name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
