package com.sfg.pet_clinic.bootstrap;

import com.sfg.pet_clinic.domain.PetType;
import com.sfg.pet_clinic.service.PetService;
import com.sfg.pet_clinic.service.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.domain.Vet;
import com.sfg.pet_clinic.service.OwnerService;
import com.sfg.pet_clinic.service.VetService;
import com.sfg.pet_clinic.service.map.OwnerServiceMap;
import com.sfg.pet_clinic.service.map.VetServiceMap;


@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	@Override
	public void run(String... args) throws Exception {

		 PetType dog = new PetType();
		 dog.setName("Dog");
		 PetType saveDogPetType = petTypeService.save(dog);

		 PetType cat = new PetType();
		 cat.setName("Cat");
		 PetType saveCatPetType = petTypeService.save(cat);


		 Owner owner1 = new Owner();
		 owner1.setId(1L);
	     owner1.setFirstName("Michael");
	     owner1.setLastName("Weston");
	     
	     ownerService.save(owner1);
	     
	     Owner owner2 = new Owner();
		 owner2.setId(1L);
	     owner2.setFirstName("Fiona");
	     owner2.setLastName("Glenanne");
	     
	     ownerService.save(owner2);
	     
	     Vet vet1 = new Vet();
	     vet1.setId(1L);
         vet1.setFirstName("Sam");
         vet1.setLastName("Axe");

         vetService.save(vet1);

         Vet vet2 = new Vet();
         vet2.setId(1L);
         vet2.setFirstName("Jessie");
         vet2.setLastName("Porter");

         vetService.save(vet2);

         System.out.println("Loaded Vets....");
         vetService.findAll().stream().forEach(x->System.out.println("Loaded Vets "+x.getFirstName()));

	}

}
