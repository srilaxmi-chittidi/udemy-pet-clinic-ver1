package com.sfg.pet_clinic.service.springdatajpa;

import com.sfg.pet_clinic.domain.Specialty;
import com.sfg.pet_clinic.repository.SpecialtyRepository;
import com.sfg.pet_clinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecilitySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepo;

    public SpecilitySDJpaService(SpecialtyRepository specialtyRepo) {
        this.specialtyRepo = specialtyRepo;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialtySet = new HashSet<>();
        specialtyRepo.findAll().forEach(specialtySet::add);
        return specialtySet;
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepo.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepo.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepo.deleteById(id);
    }
}
