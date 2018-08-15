package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Permisos;

public interface PermisosService {
	Permisos save(Permisos permisos);
	List<Permisos> findAll();
	void deletePermisos(Permisos id);	
}
