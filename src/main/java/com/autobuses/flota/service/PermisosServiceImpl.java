package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.PermisoRepository;
import com.autobuses.flota.model.Permisos;

@Service
public class PermisosServiceImpl implements PermisosService {
	@Autowired
	protected PermisoRepository permisosRepository;
	
	@Override
	public Permisos save(Permisos permisos) {
		return this.permisosRepository.save(permisos);
	}
	
	@Override
	public List<Permisos> findAll(){
		return this.permisosRepository.findAll();
	}
	
	@Override
	public void deletePermisos(Permisos id) {
		this.permisosRepository.delete(id);
	}
	
}
