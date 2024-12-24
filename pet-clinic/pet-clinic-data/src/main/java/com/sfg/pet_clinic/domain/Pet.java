package com.sfg.pet_clinic.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pet")
public class Pet extends BaseEntity{

	private static final long serialVersionUID = 1L;
	@Column(name = "name")
	private String name;
	@OneToOne
	private PetType petType;
	@ManyToOne
	private Owner owner;
	@Column(name="birth_date")
	private LocalDate birthDate;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
