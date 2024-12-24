package com.sfg.pet_clinic.service.springdatajpa;

import com.sfg.pet_clinic.domain.Vet;
import com.sfg.pet_clinic.repository.VetRepository;
import com.sfg.pet_clinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepo;

    public VetSDJpaService(VetRepository vetRepo) {
        this.vetRepo = vetRepo;
    }


    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetSet = new HashSet<>();
        vetRepo.findAll().forEach(vetSet::add);
        return vetSet;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepo.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepo.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepo.deleteById(id);
    }
}
