package com.autobuses.flota.service;

import com.autobuses.flota.dao.RolesRepository;
import com.autobuses.flota.model.Roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService{
	
	@Autowired
	protected RolesRepository rolesRepository;
	@Override
	public Roles save(Roles roles){
		return this.rolesRepository.save(roles);
	}
	@Override
	public List<Roles> findAll(){
		return this.rolesRepository.findAll();
	}
	@Override
	public void deleteRoles(Roles id){
		this.rolesRepository.delete(id);
	}
	
}
