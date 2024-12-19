package com.sfg.pet_clinic.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.pet_clinic.domain.Owner;
import com.sfg.pet_clinic.service.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({"/","/index","/index.html"})
	public String getOwners(Model model) {
		Set<Owner> list =ownerService.findAll();
		System.out.println("Set size : "+list.size());
		model.addAttribute("owners",ownerService.findAll());
		
		return "owners/index";
	}
}
