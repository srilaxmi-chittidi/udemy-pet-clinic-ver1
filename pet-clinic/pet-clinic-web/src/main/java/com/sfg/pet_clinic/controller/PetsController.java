package com.sfg.pet_clinic.controller;

import com.sfg.pet_clinic.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetsController {

    private final PetService petService;

    public PetsController(PetService petService) {
        this.petService = petService;
    }
    @RequestMapping({"/pets","/pets/index.html","/pets/index"})
    public String getPets(Model model){

        model.addAttribute("pets",petService.findAll());
        return "pets/index";
    }
}
