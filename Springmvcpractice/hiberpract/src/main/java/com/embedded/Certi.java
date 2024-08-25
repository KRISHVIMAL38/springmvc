package com.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certi {
	private String course;
	private String duration;
	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certi(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
