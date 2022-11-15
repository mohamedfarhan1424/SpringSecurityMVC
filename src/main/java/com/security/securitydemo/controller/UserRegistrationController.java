package com.security.securitydemo.controller;

import com.security.securitydemo.dto.RegistrationDto;
import com.security.securitydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public RegistrationDto getRegistration(){
        return new RegistrationDto();
    }

    @GetMapping()
    public String showRegistrationForm(){
         return "registration";
    }

    @PostMapping()
    public String userRegistration(@ModelAttribute("user") RegistrationDto registrationDto){
         userService.save(registrationDto);
         return "redirect:/registration?success";
    }
}
