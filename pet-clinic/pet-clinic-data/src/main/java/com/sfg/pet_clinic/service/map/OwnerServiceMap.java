package com.sfg.pet_clinic.service.map;

import java.util.Set;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

}
