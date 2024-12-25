package com.sfg.pet_clinic.service.springdatajpa;

import com.sfg.pet_clinic.domain.Visit;
import com.sfg.pet_clinic.repository.VisitRepository;
import com.sfg.pet_clinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepo;


    public VisitSDJpaService(VisitRepository visitRepo) {
        this.visitRepo = visitRepo;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepo.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepo.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepo.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepo.deleteById(id);
    }
}
