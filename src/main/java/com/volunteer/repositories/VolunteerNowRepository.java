package com.volunteer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.volunteer.models.VolunteerNow;


public interface VolunteerNowRepository extends JpaRepository<VolunteerNow, Integer> {

}