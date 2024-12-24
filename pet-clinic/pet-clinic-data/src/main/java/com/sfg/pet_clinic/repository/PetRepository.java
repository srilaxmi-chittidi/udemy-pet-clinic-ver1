package com.sfg.pet_clinic.repository;

import com.sfg.pet_clinic.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
