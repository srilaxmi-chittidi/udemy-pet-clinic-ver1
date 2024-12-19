package com.sfg.pet_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
}
