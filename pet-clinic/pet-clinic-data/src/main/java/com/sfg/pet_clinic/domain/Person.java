package com.sfg.pet_clinic.domain;


public class Person extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
