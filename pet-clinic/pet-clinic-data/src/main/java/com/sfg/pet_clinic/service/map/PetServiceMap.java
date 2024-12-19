package com.sfg.pet_clinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sfg.pet_clinic.domain.Pet;
import com.sfg.pet_clinic.service.PetService;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll(){
		Set<Pet> pets =super.findAll();
		pets.stream().forEach(x->System.out.println(x.getOwner()));
		return super.findAll();
	}
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
