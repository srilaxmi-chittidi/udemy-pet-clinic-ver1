package com.sfg.pet_clinic.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -476688489289458705L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
