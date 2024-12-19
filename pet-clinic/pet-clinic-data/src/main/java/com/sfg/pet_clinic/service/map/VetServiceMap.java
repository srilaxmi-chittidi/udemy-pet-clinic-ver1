package com.sfg.pet_clinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sfg.pet_clinic.domain.Vet;
import com.sfg.pet_clinic.service.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	@Override
	public Vet save(Vet object) {
		return super.save(object);
	}
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
