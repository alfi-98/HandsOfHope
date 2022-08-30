package com.volunteer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.volunteer.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>  {

	List<Role> findAll();



	

	

}
