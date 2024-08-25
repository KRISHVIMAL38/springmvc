package com.embedded;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {
	@Id
	private int id;
	private String name;
	private String city;
	private Certi certi;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Certi getCerti() {
		return certi;
	}
	public void setCerti(Certi certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}
	
	
	
}
