package com.sfg.pet_clinic.service;

import java.util.Set;

import com.sfg.pet_clinic.domain.Pet;

public interface PetService {

	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
	Pet findById(Long id);
}
