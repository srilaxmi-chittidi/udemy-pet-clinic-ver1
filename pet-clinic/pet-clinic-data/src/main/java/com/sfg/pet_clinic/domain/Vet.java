package com.sfg.pet_clinic.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="vets")
public class Vet extends Person{
    @ManyToMany
    @JoinTable(name = "vet_specialities",
                joinColumns = @JoinColumn(name = "vet_id"),
                    inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Specialty> specialties = new HashSet<>();

}
