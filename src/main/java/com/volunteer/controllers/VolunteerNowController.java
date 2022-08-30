package com.volunteer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.volunteer.models.VolunteerNow;
import com.volunteer.services.VolunteerNowService;


@Controller
public class VolunteerNowController {
    
    @Autowired
    private VolunteerNowService volunteerNowService;
    
    @GetMapping("/volunteerNow")
    public String volunteerNow(Model model) {
        
        return "volunteerNow";
    }
    
    @PostMapping("/volunteerNow")
    public String saveVolunteerNow(@ModelAttribute("volunteerNow") VolunteerNow volunteerNow){
        //save volunteer
        this.volunteerNowService.saveVolunteer(volunteerNow);
        return "redirect:/volunteer";
    }
    
    
}