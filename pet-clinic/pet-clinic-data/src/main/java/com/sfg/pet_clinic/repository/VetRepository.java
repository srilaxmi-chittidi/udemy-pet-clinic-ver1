package com.sfg.pet_clinic.repository;

import com.sfg.pet_clinic.domain.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
