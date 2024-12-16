package com.sfg.pet_clinic.service;

import java.util.Set;

import com.sfg.pet_clinic.domain.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	Owner findByLastName(String lastName);

}
