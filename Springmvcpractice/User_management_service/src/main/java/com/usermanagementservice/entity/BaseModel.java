package com.usermanagementservice.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	public BaseModel() {
		super();
	}

	public BaseModel(Long id) {
		super();
		Id = id;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	
}
