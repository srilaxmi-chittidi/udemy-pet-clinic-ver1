package com.sfg.pet_clinic.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Pet")
public class Pet extends BaseEntity{

	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	@Column(name="birth_date")
	private LocalDate birthDate;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> visitSet;

}
