package com.volunteer.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volunteer.repositories.VolunteerNowRepository;
import com.volunteer.models.VolunteerNow;

@Service
public class VolunteerNowService {
    
    @Autowired
    private VolunteerNowRepository volunteerNowRepository;
    
    
    public void saveVolunteer(VolunteerNow volunteerNow){
        this.volunteerNowRepository.save(volunteerNow);
    }
    
    
}