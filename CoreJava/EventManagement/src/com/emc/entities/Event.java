package com.emc.entities;

public class Event extends EMBase {

//	public long id;
//	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;

	public Event(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
