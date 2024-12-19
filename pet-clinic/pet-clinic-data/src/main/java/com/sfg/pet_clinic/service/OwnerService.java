package com.sfg.pet_clinic.service;

import com.sfg.pet_clinic.domain.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);

}
