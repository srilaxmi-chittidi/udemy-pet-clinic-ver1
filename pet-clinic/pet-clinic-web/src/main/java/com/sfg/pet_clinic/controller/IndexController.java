package com.sfg.pet_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"/","","index","index.html"})
	public String getIndex(Model model) {
		
	//	model.addAttribute("Index Page");
		
		return "index";
	}

	@RequestMapping({"/oups"})
	public String oups(){
		return "NotImplemented";
	}
}
