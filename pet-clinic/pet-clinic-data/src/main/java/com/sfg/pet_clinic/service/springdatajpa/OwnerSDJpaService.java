package com.sfg.pet_clinic.service.springdatajpa;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.repository.OwnerRepository;
import com.sfg.pet_clinic.repository.PetRepository;
import com.sfg.pet_clinic.repository.PetTypeRepository;
import com.sfg.pet_clinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepo;
    private final PetRepository petRepo;
    private final PetTypeRepository petTypeRepo;

    public OwnerSDJpaService(OwnerRepository ownerRepo,
                             PetRepository petRepo,
                             PetTypeRepository petTypeRepo) {
        this.ownerRepo = ownerRepo;
        this.petRepo = petRepo;
        this.petTypeRepo = petTypeRepo;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepo.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepo.findAll().forEach(ownerSet::add);
        return ownerSet;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepo.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepo.deleteById(id);
    }
}
