package com.sfg.pet_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.pet_clinic.service.VetService;

@Controller
public class VetsController {
	
	private final VetService vetService;
	
	public VetsController(VetService vetService) {
		this.vetService  = vetService;
	}

	@RequestMapping({"/vets","/vets/index","vets/index.html"})
	public String getVets(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
