package com.sfg.pet_clinic.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Owner")
public class Owner extends Person {

	@Builder
	public Owner(Long id, String firstName, String lastName, String address, String city,
				 String telephone, Set<Pet> pets) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;

		if(pets != null) {
			this.pets = pets;
		}
	}
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="telephone")
	private String telephone;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();


}
