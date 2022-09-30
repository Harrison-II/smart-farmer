package com.Final.Year.controllers;

import com.Final.Year.models.BuyerModel;
import com.Final.Year.models.FarmerModel;
import com.Final.Year.models.UserModel;
import com.Final.Year.service.BuyerService;
import com.Final.Year.service.FarmerService;
import com.Final.Year.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;
//    private final FarmerService farmerService;
//    private final BuyerService buyerService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @Bean
//    public UserService getUserService() {
//        return userService;
//    }

    @GetMapping("/register/new")
    public String register(Model model) {
        UserModel user = new UserModel();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/new/user")
    public String saveUser(@ModelAttribute("user") UserModel user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

//    @GetMapping("/user/farmer/new")
//    public String newFarmer(Model model) {
//        FarmerModel farmer = new FarmerModel();
//        model.addAttribute("farmer", farmer);
//        return "farmer_info";
//    }
//
//    @PostMapping("/user/farmer")
//    public String saveFarmer(@ModelAttribute("farmer") FarmerModel farmer) {
//        farmerService.saveFarmer(farmer);
//        return "redirect:/";
//    }
//
//    @GetMapping("/user/buyer/new")
//    public String newBuyer(Model model) {
//        BuyerModel buyer = new BuyerModel();
//        model.addAttribute("buyer", buyer);
//        return "buyer_info";
//    }
//
//    @PostMapping("/user/buyer")
//    public String saveBuyer(@ModelAttribute("buyer") BuyerModel buyer) {
//        buyerService.saveBuyer(buyer);
//        return "redirect:/";
//    }

    @GetMapping("/user/info/edit/{id}")
    public String editUser(@PathVariable long id, Model model) {
        model.addAttribute("user",userService.getUser(id));
        return "user_info";
    }

    @PostMapping("/user/info")
    public String updateUserInfo(@PathVariable Long id, @ModelAttribute("user") UserModel user) {
        UserModel existingUser = userService.getUser(id);

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setPhone(user.getPhone());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setLocation(user.getLocation());

        userService.updateUser(existingUser);

        return "redirect:/user_info";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUserAccount(@PathVariable long id){
        userService.deleteUserById(id);
        return "redirect:/login";
    }

}
