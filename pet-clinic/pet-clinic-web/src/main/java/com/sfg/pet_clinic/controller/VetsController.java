package com.sfg.pet_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

	@RequestMapping({"/vets","/vets/index","vets/index.html"})
	public String getVets(Model model) {
		return "vets/index";
	}
}
