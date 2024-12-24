package com.sfg.pet_clinic.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="vets")
public class Vet extends Person{
    @ManyToMany
    @JoinTable(name = "vet_specialities",
                joinColumns = @JoinColumn(name = "vet_id"),
                    inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
