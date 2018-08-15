package com.autobuses.flota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobuses.flota.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {
	
}
