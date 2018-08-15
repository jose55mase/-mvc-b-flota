package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Conductor;

public interface ConductorService {
	
	/**
	 * Guarda un usuario
	 * 
	 * 
	 * @return el usuario guardado
	 */
	Conductor save(Conductor conductor);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<Conductor> findAll();
	
	/**
	 * Tomar por usuario con el id recibido
	 * 
	 * @param id
	 */
	List<Conductor> getConductorTrue();
	
	/**
	 * Elimina un usuario con el id recibido
	 * 
	 * @param id
	 */
	void deleteConductor(Long id);
}
