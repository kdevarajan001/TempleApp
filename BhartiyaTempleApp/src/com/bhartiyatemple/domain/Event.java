package com.bhartiyatemple.domain;

public class Event {

	private Long id;

	private String name;

	private String description;

	private String date;

	private String time;
	
	private String repeats;
	
	private String repeatDescription;

	public Event() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRepeats() {
		return repeats;
	}

	public void setRepeats(String repeats) {
		this.repeats = repeats;
	}

	public String getRepeatDescription() {
		return repeatDescription;
	}

	public void setRepeatDescription(String repeatDescription) {
		this.repeatDescription = repeatDescription;
	}
}
