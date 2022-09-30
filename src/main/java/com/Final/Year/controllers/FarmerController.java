package com.Final.Year.controllers;

import com.Final.Year.models.FarmerModel;
import com.Final.Year.service.FarmerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    @GetMapping("/farmers")
    public String getFarmers(Model model) {
        model.addAttribute("farmers", farmerService.getAllFarmers());
        return "farmers";
    }

    @PostMapping("/farmer/new")
    public String newFarmer(@ModelAttribute("farmer") FarmerModel farmer) {
        farmerService.saveFarmer(farmer);
        return "redirect:/index";
    }

    @GetMapping("/farmer/info/edit/{id}")
    public String editFarmerInfo(@PathVariable long id, Model model) {
        model.addAttribute("farmer", farmerService.getFarmer(id));
        return "farmer_info";
    }

    @PostMapping("/farmer/{id}")
    public String updateFarmerInfo(@PathVariable long id, @ModelAttribute("farmer") FarmerModel farmer) {
        FarmerModel existingFarmer = farmerService.getFarmer(id);

        existingFarmer.setSpeciality(farmer.getSpeciality());
        farmerService.saveFarmer(existingFarmer);
        return "redirect:/farmer_info";
    }

    @GetMapping("/farmer/delete/{id}")
    public String deleteConnection(@PathVariable long id) {
        farmerService.deleteFarmerById(id);

        return "redirect:/index";
    }
}
