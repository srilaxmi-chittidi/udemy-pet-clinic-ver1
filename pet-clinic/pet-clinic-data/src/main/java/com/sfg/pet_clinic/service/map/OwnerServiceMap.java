package com.sfg.pet_clinic.service.map;

import java.util.Set;

import com.sfg.pet_clinic.domain.Pet;
import com.sfg.pet_clinic.service.PetService;
import com.sfg.pet_clinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.service.OwnerService;
@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService){
		this.petTypeService = petTypeService;
		this.petService = petService;
	}
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
		if(object != null){
			if(object.getPets() != null){
				object.getPets().forEach(pet->{
					if(pet.getPetType() != null){
						if(pet.getPetType().getId() == null){
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else{
						throw new RuntimeException("Pet Type is required");
					}
					if(pet.getId() == null){
						Pet savePet = petService.save(pet);
						pet.setId(savePet.getId());
					}
				});
			}
			return super.save(object);
		}else{
			return null;
		}
	}
	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
