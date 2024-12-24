package com.sfg.pet_clinic.repository;

import com.sfg.pet_clinic.domain.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
