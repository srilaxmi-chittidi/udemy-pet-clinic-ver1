package com.sfg.pet_clinic.service.map;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.domain.Pet;
import com.sfg.pet_clinic.service.PetService;
import com.sfg.pet_clinic.service.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1,ownerSet.size());
    }

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap() );
        ownerServiceMap.save(Owner.builder().id(1L).build());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(1L);
        assertEquals(1L,ownerServiceMap.findById(1L));
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void save() {
    }

    @Test
    void findByLastName() {
    }
}