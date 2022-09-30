package com.Final.Year.controllers;

import com.Final.Year.models.BuyerModel;
import com.Final.Year.service.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/buyers")
    public String getCustomers(Model model) {
        model.addAttribute("buyers", buyerService.getAllBuyers());
        return "buyers";
    }

    @PostMapping("/buyer/new")
    public String newCustomer(@ModelAttribute("buyer") BuyerModel buyer) {
        buyerService.saveBuyer(buyer);
        return "redirect:/index";
    }

    @GetMapping("/buyer/info/edit/{id}")
    public String editBuyerInfo(@PathVariable long id, Model model) {
        model.addAttribute("buyer", buyerService.getBuyer(id));
        return "buyers";
    }

    @PostMapping("/buyer/{id}")
    public String updateBuyerInfo(@PathVariable long id, @ModelAttribute("buyer") BuyerModel buyer) {
        BuyerModel existingBuyer = buyerService.getBuyer(id);

        existingBuyer.setBuyerType(buyer.getBuyerType());
        buyerService.updateBuyer(existingBuyer);
        return "redirect:/user_info";
    }

    @GetMapping("/buyer/delete/{id}")
    public String deleteConnection(@PathVariable Long id) {
        buyerService.deleteBuyerById(id);

        return "redirect:/index";
    }
}
