package com.sfg.pet_clinic.bootstrap;

import com.sfg.pet_clinic.domain.*;
import com.sfg.pet_clinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sfg.pet_clinic.service.map.OwnerServiceMap;
import com.sfg.pet_clinic.service.map.VetServiceMap;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }
	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if(count==0) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType saveDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType saveCatPetType = petTypeService.save(cat);
		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtyService.save(radiology);

		Specialty surgery = new Specialty();
		radiology.setDescription("Surgery");
		Specialty savedSurgery = specialtyService.save(surgery);

		Specialty dentistry = new Specialty();
		radiology.setDescription("Dentistry");
		Specialty savedDentistry = specialtyService.save(dentistry);
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("1439 American Beauty Lane");
		owner1.setCity("California");
		owner1.setTelephone("23143214567");
		Pet mikesPet = new Pet();
		mikesPet.setPetType(saveDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(1L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("3439 Indian Beauty Lane");
		owner2.setCity("Columbus");
		owner2.setTelephone("532213982313");
		Pet fionaPet = new Pet();
		fionaPet.setName("Just Cat");
		fionaPet.setOwner(owner2);
		fionaPet.setBirthDate(LocalDate.now());
		fionaPet.setPetType(saveCatPetType);
		owner2.getPets().add(fionaPet);
		ownerService.save(owner2);

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialties().add(savedRadiology);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(1L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialties().add(savedSurgery);
		vetService.save(vet2);

		System.out.println("Loaded Vets....");
		vetService.findAll().stream().forEach(x->System.out.println("Loaded Vets "+x.getFirstName()));
	}

}
