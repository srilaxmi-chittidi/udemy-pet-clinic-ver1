package com.sfg.pet_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"/","/index","/index.html"})
	public String getOwners(Model model) {
		return "/owners/index";
	}
}
