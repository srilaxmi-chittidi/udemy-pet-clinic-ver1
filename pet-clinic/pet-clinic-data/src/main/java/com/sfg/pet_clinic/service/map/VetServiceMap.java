package com.sfg.pet_clinic.service.map;

import java.util.Set;

import com.sfg.pet_clinic.domain.Specialty;
import com.sfg.pet_clinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sfg.pet_clinic.domain.Vet;
import com.sfg.pet_clinic.service.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
		if(object.getSpecialties().size() > 0){
			object.getSpecialties().forEach(specialty -> {
				if(specialty.getId() == null){
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}

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
