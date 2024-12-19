package com.sfg.pet_clinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.service.OwnerService;
@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
		return super.save(object);
	}
	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
