package com.sfg.pet_clinic.service.springdatajpa;

import com.sfg.pet_clinic.domain.PetType;
import com.sfg.pet_clinic.repository.PetTypeRepository;
import com.sfg.pet_clinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepo;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepo) {
        this.petTypeRepo = petTypeRepo;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<>();
        petTypeRepo.findAll().forEach(petTypeSet::add);
        return petTypeSet;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepo.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepo.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepo.deleteById(id);
    }
}
