package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Roles;

public interface RolesService {
	Roles save(Roles roles);
	List<Roles> findAll();
	void deleteRoles(Roles id);
}
