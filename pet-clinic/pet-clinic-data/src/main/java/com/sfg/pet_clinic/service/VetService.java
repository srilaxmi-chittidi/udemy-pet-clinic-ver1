package com.sfg.pet_clinic.service;

import java.util.Set;

import com.sfg.pet_clinic.domain.Vet;

public interface VetService {

	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
	Vet findByLastName(String lastName);
}
