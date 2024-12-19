package com.sfg.pet_clinic_data.service;

import com.sfg.pet_clinic_data.domain.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);

}
